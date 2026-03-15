package com.xevgnov.qualifier.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HtmlReportService implements ReportService {

    @Override
    public void printReport(String input) {
        System.out.println(String.format("<!DOCTYPE HTML>" +
                "<html><div>%s</div></html>", input));
    }

}
