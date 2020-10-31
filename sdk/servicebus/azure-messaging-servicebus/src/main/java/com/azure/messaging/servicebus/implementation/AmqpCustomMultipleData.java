package com.azure.messaging.servicebus.implementation;

import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.Section;

import java.util.function.Consumer;

public class AmqpCustomMultipleData implements Section {
    private final Iterable<Data> _dataList;

    public AmqpCustomMultipleData(final Iterable<Data> dataList)
    {
        this._dataList = dataList;
    }

    public Iterable<Data> getValue()
    {
        return this._dataList;
    }

    @Override
    public String toString()
    {
        final StringBuilder dataListStr = new StringBuilder();
        dataListStr.append("AmqpCustomMultipleData{");
        this._dataList.forEach(new Consumer<Data>()
        {
            @Override
            public void accept(Data data)
            {
                System.out.println(getClass().getName() + " !!!! accept data and appending ");
                dataListStr.append(data.toString());
            }
        });
        dataListStr.append('}');
        return dataListStr.toString();
    }

    @Override
    public SectionType getType() {
        return SectionType.Data;
    }
}
