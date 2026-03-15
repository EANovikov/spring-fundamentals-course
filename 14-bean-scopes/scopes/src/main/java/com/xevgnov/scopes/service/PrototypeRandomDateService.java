package com.xevgnov.scopes.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES)
@Service
public class PrototypeRandomDateService implements RandomDateService {
    private final LocalDateTime localDateTime = LocalDateTime.now();

    @Override
    public String getDate() {
        return localDateTime.toString();
    }

}
