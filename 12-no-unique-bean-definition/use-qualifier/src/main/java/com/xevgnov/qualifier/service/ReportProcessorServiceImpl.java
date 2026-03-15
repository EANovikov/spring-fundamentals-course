package com.xevgnov.qualifier.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportProcessorServiceImpl implements ReportProcessorService {

    private final ReportService reportService;

    // use @Qualifier with default bean name
    public ReportProcessorServiceImpl(@Qualifier("htmlReportService") ReportService reportService) {
        this.reportService = reportService;
    }

    // use @Qualifier with custom bean name provided via @Service / @Component annotation
//    public ReportProcessorServiceImpl(@Qualifier("xmlService") ReportService reportService) {
//        this.reportService = reportService;
//    }

    // use @Qualifier with custom bean name provided via @Qualifier
//    public ReportProcessorServiceImpl(@Qualifier("textService") ReportService reportService) {
//        this.reportService = reportService;
//    }

    @Override
    public void process(String data) {
        reportService.printReport(data);
    }
}
