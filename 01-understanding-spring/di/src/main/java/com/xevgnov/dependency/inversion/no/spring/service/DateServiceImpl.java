package com.xevgnov.dependency.inversion.no.spring.service;

import java.time.LocalDate;

public class DateServiceImpl implements DateService {
    
      public void printDate(){
        System.out.println(LocalDate.now());
      }

}
