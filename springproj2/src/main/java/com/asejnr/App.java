package com.asejnr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Alien alien1  = (Alien)factory.getBean("alien");
        alien1.code();

        System.out.println(alien1.getAge());
    }
}
