package com.azure.messaging.servicebus.implementation;

import org.apache.qpid.proton.codec.AMQPType;
import java.util.Collection;
import java.util.function.Consumer;

import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.codec.AMQPType;
import org.apache.qpid.proton.codec.TypeEncoding;
import org.apache.qpid.proton.codec.Decoder;
import org.apache.qpid.proton.codec.EncoderImpl;

public class AmqpCustomMultipleDataType implements AMQPType<AmqpCustomMultipleData> {

    private final EncoderImpl _encoder;

	private AmqpCustomMultipleDataType(final EncoderImpl encoder)
        {
            this._encoder = encoder;
        }

        @Override
        public Class<AmqpCustomMultipleData> getTypeClass()
        {
            return AmqpCustomMultipleData.class;
        }

        @Override
        public TypeEncoding<AmqpCustomMultipleData> getEncoding(AmqpCustomMultipleData val)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public TypeEncoding<AmqpCustomMultipleData> getCanonicalEncoding()
        {
            return null;
        }

        @Override
        public Collection<? extends TypeEncoding<AmqpCustomMultipleData>> getAllEncodings()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void write(AmqpCustomMultipleData val)
        {
            final AMQPType dataType = this._encoder.getTypeFromClass(Data.class);
            val.getValue().forEach(new Consumer<Data>()
            {
                @Override
                public void accept(Data data)
                {
                    dataType.write(data);
                }
            });
        }

        public static void register(Decoder decoder, EncoderImpl encoder)
        {
            // there is no special Descriptor for DataListType; other than the individual 'DataType';
            // so I believe - no Decoder needs to be registered
            AmqpCustomMultipleDataType type = new AmqpCustomMultipleDataType(encoder);
            encoder.register(type);
        }
}
