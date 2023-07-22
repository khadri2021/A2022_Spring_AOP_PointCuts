package com.khadri.spring.core.aspect;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthOptionPaneUI;

@Aspect
@Component
public class OfferAspect {
    @Before("execution(void com.khadri.spring.core.service.FestiveFoodService.biryani())")
    public void applyOfferCoupon(){
        System.out.println("Offer Applied : Added Starter ");
    }

    @After("execution(void com.khadri.spring.core.service.FestiveFoodService.biryani())")
    public void removeOfferCoupon(){
        System.out.println("Offer Closed for you");
    }
}
