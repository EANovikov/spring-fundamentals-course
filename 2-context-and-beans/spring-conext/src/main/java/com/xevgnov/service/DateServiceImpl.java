package com.xevgnov.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

// add bean dateServiceImpl to Spring IoC
@Service
public class DateServiceImpl implements DateService {
    
      public void printDate(){
        System.out.println(LocalDate.now());
      }

}
