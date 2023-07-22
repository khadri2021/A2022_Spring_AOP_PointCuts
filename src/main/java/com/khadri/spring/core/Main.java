package com.khadri.spring.core;

import com.khadri.spring.core.service.FestiveFoodService;
import com.khadri.spring.core.service.FoodService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        FoodService foodService = context.getBean(FoodService.class);
//        foodService.idlyTiffenFood();
//        foodService.pooriTiffenFood();
//        foodService.pooriLunchFood();

        FestiveFoodService festiveFoodService = context.getBean(FestiveFoodService.class);
        festiveFoodService.biryani();
    }
}