package com.hpham;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyLogger implements Logger{
    @Override
    public void debug(String message) {
        System.out.printf("%s--DEBUG--: %s%n", LocalDateTime.now(), message);
    }

    @Override
    public void info(String message) {
        System.out.printf("%s--DEBUG--: %s%n", LocalDateTime.now(), message);
    }

    @Override
    public void warn(String message) {
        System.out.printf("%s--DEBUG--: %s%n", LocalDateTime.now(), message);
    }

    @Override
    public void error(String message) {
        System.out.printf("%s--DEBUG--: %s%n", LocalDateTime.now(), message);
    }
}
