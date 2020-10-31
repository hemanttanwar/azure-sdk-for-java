package com.azure.core.amqp.implementation;

import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.DescribedType;
import org.apache.qpid.proton.amqp.Symbol;

public class AmqpDataDescribedType implements DescribedType {
    private static final Symbol DESCIPTOR_SYMBOL = Symbol.valueOf("amqp:data:binary");
    private Binary _described;

    public AmqpDataDescribedType(Binary described)
    {
        if(described == null)
        {
            throw new IllegalArgumentException("provided Binary must not be null");
        }

        _described = described;
    }

    @Override
    public Object getDescriptor()
    {
        return DESCIPTOR_SYMBOL;
    }

    @Override
    public Object getDescribed()
    {
        return _described;
    }
}
