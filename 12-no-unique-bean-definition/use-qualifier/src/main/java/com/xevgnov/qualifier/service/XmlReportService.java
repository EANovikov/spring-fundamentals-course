package com.xevgnov.qualifier.service;

import org.springframework.stereotype.Service;

@Service("xmlService")
public class XmlReportService implements ReportService {

    @Override
    public void printReport(String input) {
        System.out.println(String.format("<report>" +
                "<text>%s</text></report>", input));
    }

}
