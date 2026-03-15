package com.xevgnov.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// dateServiceImpl bean will be added to IoC container
// For demo purpose I used @Component annotation
// however in a real-life project such class should be annotated with @Service
@Component
public class DateServiceImpl implements DateService {
    
      public void printDate(){
        System.out.println(LocalDate.now());
      }

}
