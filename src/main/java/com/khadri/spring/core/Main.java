package com.khadri.spring.core;

import com.khadri.spring.core.food.service.FestiveFoodService;
import com.khadri.spring.core.hotel.service.Hotel;
import com.khadri.spring.core.journey.service.FlightJourneyService;
import com.khadri.spring.core.journey.service.TrainJourneyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        FoodService foodService = context.getBean(FoodService.class);
//        foodService.idlyTiffenFood();
//        foodService.pooriTiffenFood();
//        foodService.pooriLunchFood();

//        FestiveFoodService festiveFoodService = context.getBean(FestiveFoodService.class);
//        festiveFoodService.biryani(10);



        FlightJourneyService flightJourneyService = context.getBean(FlightJourneyService.class);
        flightJourneyService.travel1();
        flightJourneyService.travel2();
        flightJourneyService.travel3();
//
//        TrainJourneyService trainJourneyService = context.getBean(TrainJourneyService.class);
//        trainJourneyService.travel();

//        Hotel hotel = context.getBean(Hotel.class);
//        hotel.availableRooms();

    }
}