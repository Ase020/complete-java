package com.asejnr.springstarterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStarterProjectApplication {

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(SpringStarterProjectApplication.class, args);

        Alien alien1 = context.getBean(Alien.class);

        alien1.code();
    }

}
