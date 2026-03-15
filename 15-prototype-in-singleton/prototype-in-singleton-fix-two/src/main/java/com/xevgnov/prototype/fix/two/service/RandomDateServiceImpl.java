package com.xevgnov.prototype.fix.two.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ScopedProxyMode;

//Creates CGLIB proxy
// proxyMode ScopedProxyMode.DEFAULT means NO proxy 
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE,
       proxyMode = ScopedProxyMode.TARGET_CLASS)
//Create JDK Dynamic proxy, which is possible, because the service has an interface
// @Scope(value = BeanDefinition.SCOPE_PROTOTYPE,       
    //    proxyMode = ScopedProxyMode.INTERFACES)
@Service
public class RandomDateServiceImpl implements RandomDateService {

    private LocalDateTime localDateTime = LocalDateTime.now();

    @Override
    public String getDate() {
        return localDateTime.toString();
    }

}
