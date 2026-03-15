package com.xevgnov.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class DateServiceImpl implements DateService {
    
      public String getDate(){
        return LocalDate.now().toString();
      }

}
