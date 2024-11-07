package com.asejnr.springJDBC.repository;

import com.asejnr.springJDBC.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Player player) {
        String sql = "INSERT INTO player (id, name, age, gender, position) VALUES (?,?,?,?,?)";

        int rows = jdbcTemplate.update(sql, player.getId(), player.getName(), player.getAge(), player.getGender(), player.getPosition());
        System.out.println("rows: " + rows);
    }

    public List<Player> findAll() {
        String sql = "SELECT * FROM player";

        RowMapper<Player> rowMapper = (ResultSet rs, int rowNum) -> {
                Player player = new Player();
                player.setId(rs.getInt("id"));
                player.setName(rs.getString("name"));
                player.setAge(rs.getInt("age"));
                player.setGender(rs.getString("gender"));
                player.setPosition(rs.getString("position"));

                return player;
        };

        return jdbcTemplate.query(sql, rowMapper);
    }
}
