package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.display(..))")
    public void logBefore() {
        System.out.println(" Method Started ");
    }

    @After("execution(* com.library.service.BookService.display(..))")
    public void logAfter() {
        System.out.println(" Method Completed ");
    }
}