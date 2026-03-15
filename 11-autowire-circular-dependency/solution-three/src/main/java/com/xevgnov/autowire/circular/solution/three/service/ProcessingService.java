package com.xevgnov.autowire.circular.solution.three.service;

import com.xevgnov.autowire.circular.solution.three.dto.Order;

public interface ProcessingService {
    
  void process(Order order);

}
