package com.khadri.spring.core.food.service;


import org.springframework.stereotype.Component;

@Component
public class FestiveFoodService {
    public void biryani(){
        System.out.println("Biryani with cost Rs.300");
    }

    public void biryani(int quntity){
        System.out.println(" Biryani quantity "+quntity);
    }
}
