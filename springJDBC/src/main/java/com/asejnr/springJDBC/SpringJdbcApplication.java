package com.asejnr.springJDBC;

import com.asejnr.springJDBC.model.Player;
import com.asejnr.springJDBC.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Player player1 = context.getBean(Player.class);
		player1.setId(104);
		player1.setName("Player1");
		player1.setAge(20);
		player1.setGender("Male");
		player1.setPosition("Midfielder");

		System.out.println(player1);
		PlayerRepository playerRepo = context.getBean(PlayerRepository.class);
		playerRepo.save(player1);

		System.out.println(playerRepo.findAll());
	}

}
