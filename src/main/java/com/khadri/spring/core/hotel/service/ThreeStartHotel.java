package com.khadri.spring.core.hotel.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ThreeStartHotel implements  Hotel{
    @Override
    public void availableRooms() {
        System.out.println("ThreeStartHotel: All Rooms are available");
    }
}
