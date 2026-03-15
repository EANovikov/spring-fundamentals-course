package com.xevgnov.collection.service;

import org.springframework.stereotype.Service;

@Service
public class TextReportService implements ReportService {

    @Override
    public void printReport(String input) {
        System.out.println("*** " + input + " ***");
    }

}
