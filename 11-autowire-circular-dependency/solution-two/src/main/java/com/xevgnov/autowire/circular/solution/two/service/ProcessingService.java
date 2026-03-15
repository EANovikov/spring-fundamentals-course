package com.xevgnov.autowire.circular.solution.two.service;

import com.xevgnov.autowire.circular.solution.two.dto.Order;

public interface ProcessingService {
    
  void process(Order order);

}
