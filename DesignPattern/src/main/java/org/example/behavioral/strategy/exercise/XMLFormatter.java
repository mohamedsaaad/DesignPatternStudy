package org.example.behavioral.strategy.exercise;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLFormatter implements Formatter{
    @Override
    public String format(Object object) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(object);
        return xml;
    }
}
