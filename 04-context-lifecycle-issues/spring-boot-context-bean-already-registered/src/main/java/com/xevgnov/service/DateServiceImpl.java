package com.xevgnov.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateServiceImpl implements DateService {

    public void printDate() {
        System.out.println(LocalDate.now());
    }

}
