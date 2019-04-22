package com.wg.learn.chapter4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.web.context.support.GroovyWebApplicationContext;

public class GroovyApplicationContextTest {

    @Test

    public void getBean()
    {

        ApplicationContext ctx = GenericGroovyApplicationContext("classpath:com/wg/learn/chapter4/groovy-beans.groovy");

        Car car = (Car)ctx.getBean("car");

        System.out.println(car.getMaxspeed());

    }
}
