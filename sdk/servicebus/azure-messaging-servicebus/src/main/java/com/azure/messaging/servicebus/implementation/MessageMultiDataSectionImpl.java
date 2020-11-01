// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation;

import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.UnsignedByte;
import org.apache.qpid.proton.amqp.UnsignedInteger;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.DeliveryAnnotations;
import org.apache.qpid.proton.amqp.messaging.Footer;
import org.apache.qpid.proton.amqp.messaging.Header;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.amqp.messaging.Properties;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.codec.AMQPDefinedTypes;
import org.apache.qpid.proton.codec.CompositeWritableBuffer;
import org.apache.qpid.proton.codec.DecoderImpl;
import org.apache.qpid.proton.codec.DroppingWritableBuffer;
import org.apache.qpid.proton.codec.EncoderImpl;
import org.apache.qpid.proton.codec.ReadableBuffer;
import org.apache.qpid.proton.codec.WritableBuffer;
import org.apache.qpid.proton.codec.messaging.HeaderType;
import org.apache.qpid.proton.message.Message;
import org.apache.qpid.proton.message.MessageError;
import org.apache.qpid.proton.message.ProtonJMessage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageMultiDataSectionImpl implements ProtonJMessage {
    private final ClientLogger logger = new ClientLogger(MessageMultiDataSectionImpl.class);

    private Header _header;
    private DeliveryAnnotations _deliveryAnnotations;
    private MessageAnnotations _messageAnnotations;
    private Properties _properties;
    private ApplicationProperties _applicationProperties;
    private Section _body;
    private List<Section> _body_section_additional;
    private Footer _footer;

    private static final ThreadLocal<MessageMultiDataSectionImpl.EncoderDecoderPair> tlsCodec =
        new ThreadLocal<MessageMultiDataSectionImpl.EncoderDecoderPair>() {
            protected MessageMultiDataSectionImpl.EncoderDecoderPair initialValue() {
                return new MessageMultiDataSectionImpl.EncoderDecoderPair();
            }
        };

    public static final class Factory {
        public Factory() {
        }

        public static Message create() {
            return new MessageMultiDataSectionImpl();
        }

        public static Message create(Header header, DeliveryAnnotations deliveryAnnotations, MessageAnnotations messageAnnotations, Properties properties, ApplicationProperties applicationProperties, Section body, Footer footer) {
            return new MessageMultiDataSectionImpl(header, deliveryAnnotations, messageAnnotations, properties, applicationProperties, body, footer);
        }
    }

    MessageMultiDataSectionImpl() {
    }

    MessageMultiDataSectionImpl(Header header, DeliveryAnnotations deliveryAnnotations, MessageAnnotations messageAnnotations, Properties properties, ApplicationProperties applicationProperties, Section body, Footer footer) {
        this._header = header;
        this._deliveryAnnotations = deliveryAnnotations;
        this._messageAnnotations = messageAnnotations;
        this._properties = properties;
        this._applicationProperties = applicationProperties;
        this._body_section_additional = new ArrayList<>();
        this._body = body;
        this._footer = footer;
    }

    public void addDataSection(Section dataBody) {
        _body_section_additional.add(dataBody);
    }
    public boolean isDurable() {
        return this._header != null && this._header.getDurable() != null ? this._header.getDurable() : false;
    }

    public long getDeliveryCount() {
        return this._header != null && this._header.getDeliveryCount() != null ? this._header.getDeliveryCount().longValue() : 0L;
    }

    public short getPriority() {
        return this._header != null && this._header.getPriority() != null ? this._header.getPriority().shortValue() : 4;
    }

    public boolean isFirstAcquirer() {
        return this._header != null && this._header.getFirstAcquirer() != null ? this._header.getFirstAcquirer() : false;
    }

    public long getTtl() {
        return this._header != null && this._header.getTtl() != null ? this._header.getTtl().longValue() : 0L;
    }

    public void setDurable(boolean durable) {
        if (this._header == null) {
            if (!durable) {
                return;
            }

            this._header = new Header();
        }

        this._header.setDurable(durable);
    }

    public void setTtl(long ttl) {
        if (this._header == null) {
            if (ttl == 0L) {
                return;
            }

            this._header = new Header();
        }

        this._header.setTtl(UnsignedInteger.valueOf(ttl));
    }

    public void setDeliveryCount(long deliveryCount) {
        if (this._header == null) {
            if (deliveryCount == 0L) {
                return;
            }

            this._header = new Header();
        }

        this._header.setDeliveryCount(UnsignedInteger.valueOf(deliveryCount));
    }

    public void setFirstAcquirer(boolean firstAcquirer) {
        if (this._header == null) {
            if (!firstAcquirer) {
                return;
            }

            this._header = new Header();
        }

        this._header.setFirstAcquirer(firstAcquirer);
    }

    public void setPriority(short priority) {
        if (this._header == null) {
            if (priority == 4) {
                return;
            }

            this._header = new Header();
        }

        this._header.setPriority(UnsignedByte.valueOf((byte)priority));
    }

    public Object getMessageId() {
        return this._properties == null ? null : this._properties.getMessageId();
    }

    public long getGroupSequence() {
        return this._properties != null && this._properties.getGroupSequence() != null ? (long)this._properties.getGroupSequence().intValue() : 0L;
    }

    public String getReplyToGroupId() {
        return this._properties == null ? null : this._properties.getReplyToGroupId();
    }

    public long getCreationTime() {
        return this._properties != null && this._properties.getCreationTime() != null ? this._properties.getCreationTime().getTime() : 0L;
    }

    public String getAddress() {
        return this._properties == null ? null : this._properties.getTo();
    }

    public byte[] getUserId() {
        if (this._properties != null && this._properties.getUserId() != null) {
            Binary userId = this._properties.getUserId();
            byte[] id = new byte[userId.getLength()];
            System.arraycopy(userId.getArray(), userId.getArrayOffset(), id, 0, userId.getLength());
            return id;
        } else {
            return null;
        }
    }

    public String getReplyTo() {
        return this._properties == null ? null : this._properties.getReplyTo();
    }

    public String getGroupId() {
        return this._properties == null ? null : this._properties.getGroupId();
    }

    public String getContentType() {
        return this._properties != null && this._properties.getContentType() != null ? this._properties.getContentType().toString() : null;
    }

    public long getExpiryTime() {
        return this._properties != null && this._properties.getAbsoluteExpiryTime() != null ? this._properties.getAbsoluteExpiryTime().getTime() : 0L;
    }

    public Object getCorrelationId() {
        return this._properties == null ? null : this._properties.getCorrelationId();
    }

    public String getContentEncoding() {
        return this._properties != null && this._properties.getContentEncoding() != null ? this._properties.getContentEncoding().toString() : null;
    }

    public String getSubject() {
        return this._properties == null ? null : this._properties.getSubject();
    }

    public void setGroupSequence(long groupSequence) {
        if (this._properties == null) {
            if (groupSequence == 0L) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setGroupSequence(UnsignedInteger.valueOf((int)groupSequence));
    }

    public void setUserId(byte[] userId) {
        if (userId == null) {
            if (this._properties != null) {
                this._properties.setUserId((Binary)null);
            }
        } else {
            if (this._properties == null) {
                this._properties = new Properties();
            }

            byte[] id = new byte[userId.length];
            System.arraycopy(userId, 0, id, 0, userId.length);
            this._properties.setUserId(new Binary(id));
        }

    }

    public void setCreationTime(long creationTime) {
        if (this._properties == null) {
            if (creationTime == 0L) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setCreationTime(new Date(creationTime));
    }

    public void setSubject(String subject) {
        if (this._properties == null) {
            if (subject == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setSubject(subject);
    }

    public void setGroupId(String groupId) {
        if (this._properties == null) {
            if (groupId == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setGroupId(groupId);
    }

    public void setAddress(String to) {
        if (this._properties == null) {
            if (to == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setTo(to);
    }

    public void setExpiryTime(long absoluteExpiryTime) {
        if (this._properties == null) {
            if (absoluteExpiryTime == 0L) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setAbsoluteExpiryTime(new Date(absoluteExpiryTime));
    }

    public void setReplyToGroupId(String replyToGroupId) {
        if (this._properties == null) {
            if (replyToGroupId == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setReplyToGroupId(replyToGroupId);
    }

    public void setContentEncoding(String contentEncoding) {
        if (this._properties == null) {
            if (contentEncoding == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setContentEncoding(Symbol.valueOf(contentEncoding));
    }

    public void setContentType(String contentType) {
        if (this._properties == null) {
            if (contentType == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setContentType(Symbol.valueOf(contentType));
    }

    public void setReplyTo(String replyTo) {
        if (this._properties == null) {
            if (replyTo == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setReplyTo(replyTo);
    }

    public void setCorrelationId(Object correlationId) {
        if (this._properties == null) {
            if (correlationId == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setCorrelationId(correlationId);
    }

    public void setMessageId(Object messageId) {
        if (this._properties == null) {
            if (messageId == null) {
                return;
            }

            this._properties = new Properties();
        }

        this._properties.setMessageId(messageId);
    }

    public Header getHeader() {
        return this._header;
    }

    public DeliveryAnnotations getDeliveryAnnotations() {
        return this._deliveryAnnotations;
    }

    public MessageAnnotations getMessageAnnotations() {
        return this._messageAnnotations;
    }

    public Properties getProperties() {
        return this._properties;
    }

    public ApplicationProperties getApplicationProperties() {
        return this._applicationProperties;
    }

    public Section getBody() {
        return this._body;
    }

    public Footer getFooter() {
        return this._footer;
    }

    public void setHeader(Header header) {
        this._header = header;
    }

    public void setDeliveryAnnotations(DeliveryAnnotations deliveryAnnotations) {
        this._deliveryAnnotations = deliveryAnnotations;
    }

    public void setMessageAnnotations(MessageAnnotations messageAnnotations) {
        this._messageAnnotations = messageAnnotations;
    }

    public void setProperties(Properties properties) {
        this._properties = properties;
    }

    public void setApplicationProperties(ApplicationProperties applicationProperties) {
        this._applicationProperties = applicationProperties;
    }

    public void setBody(Section body) {
        this._body = body;
    }

    public void setFooter(Footer footer) {
        this._footer = footer;
    }

    public int decode(byte[] data, int offset, int length) {
        ByteBuffer buffer = ByteBuffer.wrap(data, offset, length);
        this.decode(buffer);
        return length - buffer.remaining();
    }

    public void decode(ByteBuffer buffer) {
        this.decode((ReadableBuffer) ReadableBuffer.ByteBufferReader.wrap(buffer));
    }

    public void decode(ReadableBuffer buffer) {
        DecoderImpl decoder = ((MessageMultiDataSectionImpl.EncoderDecoderPair)tlsCodec.get()).decoder;
        decoder.setBuffer(buffer);
        this._header = null;
        this._deliveryAnnotations = null;
        this._messageAnnotations = null;
        this._properties = null;
        this._applicationProperties = null;
        this._body = null;
        this._footer = null;
        Section section = null;
        if (buffer.hasRemaining()) {
            section = (Section)decoder.readObject();
        }

        logger.verbose("Decoding the bytes into message.");

        if (section instanceof Header) {

            this._header = (Header)section;
            if (buffer.hasRemaining()) {
                logger.verbose("Reading Header section");
                section = (Section)decoder.readObject();
            } else {
                section = null;
            }
        }

        if (section instanceof DeliveryAnnotations) {
            this._deliveryAnnotations = (DeliveryAnnotations)section;
            if (buffer.hasRemaining()) {
                logger.verbose("Reading DeliveryAnnotations section");
                section = (Section)decoder.readObject();
            } else {
                section = null;
            }
        }

        if (section instanceof MessageAnnotations) {
            this._messageAnnotations = (MessageAnnotations)section;
            if (buffer.hasRemaining()) {
                logger.verbose("Reading MessageAnnotations section");
                section = (Section)decoder.readObject();
            } else {
                section = null;
            }
        }

        if (section instanceof Properties) {
            this._properties = (Properties)section;
            if (buffer.hasRemaining()) {
                logger.verbose("Reading Properties section");
                section = (Section)decoder.readObject();
            } else {
                section = null;
            }
        }

        if (section instanceof ApplicationProperties) {
            this._applicationProperties = (ApplicationProperties)section;
            if (buffer.hasRemaining()) {
                logger.verbose("Reading ApplicationProperties section");
                section = (Section)decoder.readObject();
            } else {
                section = null;
            }
        }

        if (section != null && !(section instanceof Footer)) {
            this._body = section;
            if (buffer.hasRemaining()) {
                logger.verbose("Reading Footer section");
                section = (Section)decoder.readObject();
            } else {
                section = null;
            }
        }

        if (section instanceof Footer) {
            this._footer = (Footer)section;
        }

        decoder.setBuffer((ReadableBuffer)null);
        logger.verbose("decoding done body : " +  getBody());
        logger.verbose("Exit of decoding");
    }

    public int encode(byte[] data, int offset, int length) {
        ByteBuffer buffer = ByteBuffer.wrap(data, offset, length);
        return this.encode(new WritableBuffer.ByteBufferWrapper(buffer));
    }

    public int encode2(byte[] data, int offset, int length) {
        ByteBuffer buffer = ByteBuffer.wrap(data, offset, length);
        WritableBuffer.ByteBufferWrapper first = new WritableBuffer.ByteBufferWrapper(buffer);
        DroppingWritableBuffer second = new DroppingWritableBuffer();
        CompositeWritableBuffer composite = new CompositeWritableBuffer(first, second);
        int start = composite.position();
        this.encode(composite);
        return composite.position() - start;
    }

    public int encode(WritableBuffer buffer) {
        int length = buffer.remaining();
        EncoderImpl encoder = ((MessageMultiDataSectionImpl.EncoderDecoderPair)tlsCodec.get()).encoder;
        encoder.setByteBuffer(buffer);
        if (this.getHeader() != null) {
            encoder.writeObject(this.getHeader());
        }

        if (this.getDeliveryAnnotations() != null) {
            encoder.writeObject(this.getDeliveryAnnotations());
        }

        if (this.getMessageAnnotations() != null) {
            encoder.writeObject(this.getMessageAnnotations());
        }

        if (this.getProperties() != null) {
            encoder.writeObject(this.getProperties());
        }

        if (this.getApplicationProperties() != null) {
            encoder.writeObject(this.getApplicationProperties());
        }

        if (this.getBody() != null) {
            encoder.writeObject(this.getBody());
        }

        if (this.getFooter() != null) {
            encoder.writeObject(this.getFooter());
        }

        encoder.setByteBuffer((WritableBuffer)null);
        return length - buffer.remaining();
    }

    public void clear() {
        this._body = null;
    }

    public MessageError getError() {
        return MessageError.OK;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Message{");
        if (this._header != null) {
            sb.append("header=");
            sb.append(this._header);
        }

        if (this._properties != null) {
            sb.append("properties=");
            sb.append(this._properties);
        }

        if (this._messageAnnotations != null) {
            sb.append("message_annotations=");
            sb.append(this._messageAnnotations);
        }

        if (this._body != null) {
            sb.append("body=");
            sb.append(this._body);
        }

        sb.append("}");
        return sb.toString();
    }

    private static class EncoderDecoderPair {
        MultiDataSectionDecoderImpl decoder;
        EncoderImpl encoder;

        private EncoderDecoderPair() {
            this.decoder = new MultiDataSectionDecoderImpl();
            this.encoder = new EncoderImpl(this.decoder);
            HeaderType.register(decoder, encoder);
            AMQPDefinedTypes.registerAllTypes(this.decoder, this.encoder);
        }
    }
}


