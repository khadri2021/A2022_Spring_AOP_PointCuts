package com.khadri.spring.core.hotel.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class FiveStarHotel implements Hotel{
    @Override
    public void availableRooms() {
        System.out.println("FiveStarHotel: Partial Rooms are available");
    }
}
