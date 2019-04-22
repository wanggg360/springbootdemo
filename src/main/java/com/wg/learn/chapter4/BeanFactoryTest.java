package com.wg.learn.chapter4;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;


public class BeanFactoryTest {

    @Test
    public  void getBean () throws Throwable
    {
        ResourcePatternResolver rpr = new PathMatchingResourcePatternResolver();

        Resource res = rpr.getResource("classpath:com/wg/learn/chapter4/beancar.xml");

        System.out.println(res.getURL());

        DefaultListableBeanFactory dbf = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader x = new XmlBeanDefinitionReader(dbf);

        x.loadBeanDefinitions(res);

        System.out.println("init bean");

        Car car = dbf.getBean("car",Car.class);

        System.out.println(car.getColor());



    }
}
