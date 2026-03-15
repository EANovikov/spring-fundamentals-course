package com.xevgnov.by.name.service;

import org.springframework.stereotype.Service;

@Service("textReport")
public class TextReportService implements ReportService {

    @Override
    public void printReport(String input) {
        System.out.println("*** " + input + " ***");
    }

}
