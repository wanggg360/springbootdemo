package com.wg.learn.chapter4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {


    @Bean(name="car")
    public Car buildCar()
    {
        Car car = new Car();

        car.setBrand("wanggang");

        car.setColor("L");
        car.setMaxspeed(400);

        return  car;
    }

}
