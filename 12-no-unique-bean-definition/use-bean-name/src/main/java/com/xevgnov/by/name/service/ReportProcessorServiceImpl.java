package com.xevgnov.by.name.service;

import org.springframework.stereotype.Service;

@Service
public class ReportProcessorServiceImpl implements ReportProcessorService {

    private final ReportService reportService;

    /*
     inject bean by name
     better alternative to explicitly providing the type
     HtmlReportService htmlReportService
     which creates more coupling between the classes
     Note: bean name is crucial! If bean name is changed in the configuration, remember to use exactly the same name for injection
   */
    public ReportProcessorServiceImpl(ReportService htmlReportService) {
        this.reportService = htmlReportService;
    }

    /*
     if the bean was renamed, you need to use exactly the same argument here
     @Service("textReport") means that we cannot use the default name textReportService any more
     however Spring is able to identify,
     that "textReport" is a bean for TextReportService type and inject it
     */
//    public ReportProcessorServiceImpl(ReportService textReport) {
//        this.reportService = textReport;
//    }

    @Override
    public void process(String data) {
        reportService.printReport(data);
    }
}
