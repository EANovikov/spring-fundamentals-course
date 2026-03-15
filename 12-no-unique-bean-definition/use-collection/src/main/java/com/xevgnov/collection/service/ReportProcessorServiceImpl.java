package com.xevgnov.collection.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ReportProcessorServiceImpl implements ReportProcessorService {

    private final List<ReportService> reportServiceList;

    private final Set<ReportService> reportServiceSet;

    private final Map<String, ReportService> reportServiceMap;

    public ReportProcessorServiceImpl(List<ReportService> reportServiceList, Set<ReportService> reportServiceSet, Map<String, ReportService> reportServiceMap) {
        this.reportServiceList = reportServiceList;
        this.reportServiceSet = reportServiceSet;
        this.reportServiceMap = reportServiceMap;
    }

    //Example for List
    @Override
    public void process(String data) {
        reportServiceList
                .forEach(entry -> entry.printReport(data));
    }

    //Example for Set
//    @Override
//    public void process(String data) {
//        reportServiceSet
//                .forEach(entry -> entry.printReport(data));
//    }

    //Example for Map
    //Spring is able to assume, that Map key is a bean name
    //and the keys will contains bean names: htmlReportService, textReportService, xmlReportService
//    @Override
//    public void process(String data) {
//        reportServiceMap.forEach((key, value) -> {
//            System.out.println("bean name: " + key);
//            value.printReport(data);
//        });
//    }
}
