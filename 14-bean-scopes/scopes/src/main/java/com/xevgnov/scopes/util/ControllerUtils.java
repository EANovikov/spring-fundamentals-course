package com.xevgnov.scopes.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ControllerUtils {

    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            log.warn("sleep interrupted by: " + e);
        }
    }

}
