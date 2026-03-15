package com.xevgnov.service;

import java.time.LocalTime;

public class TimeServiceImpl implements TimeService {
  public String getTime() {
    return LocalTime.now().toString();
  }

}
