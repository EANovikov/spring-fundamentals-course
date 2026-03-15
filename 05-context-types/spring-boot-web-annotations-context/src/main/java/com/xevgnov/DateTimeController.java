package com.xevgnov;

import com.xevgnov.service.DateTimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DateTimeController {

    private final DateTimeService dateTimeService;

    public DateTimeController(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    @GetMapping
    public String getDateTime() {
        return dateTimeService.getDateTime();
    }

}
