package com.xevgnov.scopes.service;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.xevgnov.scopes.custom.CacheScope;

@Scope(value = CacheScope.CACHE_SCOPE, proxyMode = ScopedProxyMode.INTERFACES)
@Service
public class CustomRandomDateService implements RandomDateService {

    private final LocalDateTime localDateTime = LocalDateTime.now();

    @Override
    public String getDate() {
        return localDateTime.toString();
    }
}
