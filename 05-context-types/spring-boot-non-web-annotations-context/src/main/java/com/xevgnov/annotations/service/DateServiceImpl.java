package com.xevgnov.annotations.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class DateServiceImpl implements DateService {
    
      public void printDate(){
        System.out.println(LocalDate.now());
      }

}
