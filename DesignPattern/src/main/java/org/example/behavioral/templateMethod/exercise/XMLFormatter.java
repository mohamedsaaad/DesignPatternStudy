package org.example.behavioral.templateMethod.exercise;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLFormatter extends Formatter {
    @Override
    public String format(Object object) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(object);
        return xml;
    }
}
