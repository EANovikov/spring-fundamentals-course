package com.xevgnov.autowire.circular.problem.service;

import com.xevgnov.autowire.circular.problem.dto.Order;

public interface ProcessingService {
    
  void process(Order order);

}
