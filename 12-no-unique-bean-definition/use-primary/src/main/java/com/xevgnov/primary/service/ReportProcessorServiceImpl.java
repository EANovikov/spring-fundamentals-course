package com.xevgnov.primary.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportProcessorServiceImpl implements ReportProcessorService {

    private final ReportService reportService;

    // Primary bean is injected
    public ReportProcessorServiceImpl(ReportService reportService) {
        this.reportService = reportService;
    }

    // However it is possible to inject other beans by applying @Qualifier
//     public ReportProcessorServiceImpl(@Qualifier("textReportService") ReportService reportService) {
//             this.reportService = reportService;
//     }

    @Override
    public void process(String data) {
        reportService.printReport(data);
    }
}
