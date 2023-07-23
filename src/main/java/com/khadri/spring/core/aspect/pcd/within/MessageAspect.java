package com.khadri.spring.core.aspect.pcd.within;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {


    @Pointcut("within(com.khadri.spring.core.journey.service.FlightJourneyService)") // Named Point
    public void withinPointCut(){}

    @Before("withinPointCut()")
    public void beforeAdvice(){
        System.out.println("Happy Journey!!!!!!!!!!!!");
    }
    @After("withinPointCut()")
    public void afterAdvice(){
        System.out.println("Welcome Back !!!!!!!!!");
    }
}
