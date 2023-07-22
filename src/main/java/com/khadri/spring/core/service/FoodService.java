package com.khadri.spring.core.service;


import org.springframework.stereotype.Component;

@Component
public class FoodService {

    public void idlyTiffenFood(){
        System.out.println("FoodService: idlyTiffenFood()");
    }

    public void pooriTiffenFood(){
        System.out.println("FoodService: pooriTiffenFood()");
    }

    public void pooriLunchFood(){
        System.out.println("FoodService: pooriLunchFood()");
    }
}
