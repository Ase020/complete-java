package com.asejnr.springbootrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResource {

    @RequestMapping("aliens")
    public List<Alien> getAliens(){
        List<Alien> aliens = new ArrayList<>();

        Alien alien1 = new Alien();
        alien1.setId(101);
        alien1.setName("SpringAlien1");
        alien1.setAge(2002);
        alien1.setPoints(200);

        Alien alien2 = new Alien();
        alien2.setId(102);
        alien2.setName("SpringAlien2");
        alien2.setAge(2004);
        alien2.setPoints(400);

        aliens.add(alien1);
        aliens.add(alien2);

        return aliens;
    }
}
