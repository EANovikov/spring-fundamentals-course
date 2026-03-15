package com.xevgnov.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeServiceImpl implements TimeService {
    public void printTime() {
        System.out.println(LocalTime.now());
    }

}
