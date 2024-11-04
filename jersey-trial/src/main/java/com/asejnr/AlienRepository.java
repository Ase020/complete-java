package com.asejnr;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepository {
//    List<Alien> aliens;
    Connection conn = null;

    public AlienRepository() {
        String url = "jdbc:mysql://localhost:3306/restdb";
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        aliens = new ArrayList<Alien>();
//
//        Alien alien1 = new Alien();
//        alien1.setId(1);
//        alien1.setName("Alien1");
//        alien1.setAge(2000);
//        alien1.setPoints(50);
//
//        Alien alien2 = new Alien();
//        alien2.setId(2);
//        alien2.setName("Alien2");
//        alien2.setAge(5893);
//        alien2.setPoints(87);
//
//        aliens.add(alien1);
//        aliens.add(alien2);
    }

    public List<Alien> getAliens() {
        List<Alien> aliens = new ArrayList<>();
        String sql = "SELECT * FROM alientable";
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Alien alien = new Alien();
                alien.setId(resultSet.getInt(1));
                alien.setName(resultSet.getString(2));
                alien.setAge(resultSet.getInt(3));
                alien.setPoints(resultSet.getInt(4));
                aliens.add(alien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return aliens;
    }

    public Alien getAlienById(int id) {
        Alien alien = new Alien();
        String sql = "SELECT * FROM alientable WHERE id = " + id;
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                alien.setId(resultSet.getInt(1));
                alien.setName(resultSet.getString(2));
                alien.setAge(resultSet.getInt(3));
                alien.setPoints(resultSet.getInt(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return alien;
//        for (Alien alien1 : aliens) {
//            if (alien1.getId() == (id)) {
//                return alien1;
//            }
//        }
//        return null;
    }

    public void createAlien(Alien newAlien) {
        String sql = "INSERT INTO alientable VALUES (?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, newAlien.getId());
            statement.setString(2, newAlien.getName());
            statement.setInt(3, newAlien.getAge());
            statement.setInt(4, newAlien.getPoints());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        aliens.add(newAlien);
    }

    public void updateAlien(Alien newAlien) {
       String sql = "UPDATE alientable SET name = ?, age = ?, points = ? WHERE id = ?";
       try {
           PreparedStatement preparedStatement = conn.prepareStatement(sql);
           preparedStatement.setString(1, newAlien.getName());
           preparedStatement.setInt(2, newAlien.getAge());
           preparedStatement.setInt(3, newAlien.getPoints());
           preparedStatement.setInt(4, newAlien.getId());
           preparedStatement.executeUpdate();
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

    public void deleteAlien(int id) {
        String sql = "DELETE FROM alientable WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
