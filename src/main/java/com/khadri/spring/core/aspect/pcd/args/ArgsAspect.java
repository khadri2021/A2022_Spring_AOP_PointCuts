package com.khadri.spring.core.aspect.pcd.args;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ArgsAspect {

    @Before("args(int)")
    public void orderBiryaniQuantity(){
        System.out.println("`check the order with quantity");
    }


}
