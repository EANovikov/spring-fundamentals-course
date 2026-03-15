package com.xevgnov.scopes.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Service
public class RequestRandomDateService implements RandomDateService {

    private final LocalDateTime localDateTime = LocalDateTime.now();

    @Override
    public String getDate() {
        return localDateTime.toString();
    }
}
