package com.khadri.spring.core.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PayAspect {
    @Before("execution(void com.khadri.spring.core.service.FoodService.idlyTiffenFood())")
    public void payIdly(){
        System.out.println("Rs.30 payment for idly");
    }

    @Before("execution(void com.khadri.spring.core.service.FoodService.*Food())")
    public void payIdlyAndPoori(){
        System.out.println("Rs.30 payment for idly and Rs.50 payment for poori");
    }
}
