package com.asejnr;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("aliens")
public class AlienResource {

    AlienRepository alienRepository = new AlienRepository();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Alien getAlienById(@PathParam("id") int id) {
//        Alien alien1 = new Alien();
//        alien1.setName("Alien1");
//        alien1.setAge(2000);
//        alien1.setPoints(50);

        return alienRepository.getAlienById(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alien> getAliens() {
//        Alien alien1 = new Alien();
//        alien1.setName("Alien1");
//        alien1.setAge(2000);
//        alien1.setPoints(50);
//
//        Alien alien2 = new Alien();
//        alien2.setName("Alien2");
//        alien2.setAge(5893);
//        alien2.setPoints(87);
//
//        List<Alien> aliens = new ArrayList<Alien>();
//        aliens.add(alien1);
//        aliens.add(alien2);

        return alienRepository.getAliens();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Alien createAlien(Alien alien) {
        System.out.println(alien);
        alienRepository.createAlien(alien);

        return alien;
    }

    @PUT
    @Path("/id")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Alien updateAlien(Alien alien) {
        if (alienRepository.getAlienById(alien.getId()).getId() == 0) {
            alienRepository.createAlien(alien);
        }else {
            alienRepository.updateAlien(alien);
        }
        return alien;
    }

    @DELETE
    @Path("/{id}")
    public void deleteAlien(@PathParam("id") int id) {
        Alien alien = alienRepository.getAlienById(id);

        if (alien.getId() != 0) {
            alienRepository.deleteAlien(id);
        }
    }

}
