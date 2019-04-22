package com.wg.learn.chapter4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    public void getBean()
    {
        ApplicationContext atx = new AnnotationConfigApplicationContext(Beans.class);

        Car car = atx.getBean("car",Car.class);

        System.out.println(car.getMaxspeed());

    }
}
