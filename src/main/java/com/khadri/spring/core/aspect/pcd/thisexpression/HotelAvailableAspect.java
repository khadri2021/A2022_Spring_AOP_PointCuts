package com.khadri.spring.core.aspect.pcd.thisexpression;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HotelAvailableAspect {


    @Before("this(com.khadri.spring.core.hotel.service.Hotel)")
    public void callHotelThis(){
        System.out.println("call to hotel for rooms!!!!");
    }

    @Before("target(com.khadri.spring.core.hotel.service.Hotel)")
    public void callHotelTarget(){
        System.out.println("call to hotel for rooms!!!!");
    }
}
