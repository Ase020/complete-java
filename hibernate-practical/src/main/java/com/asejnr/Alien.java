package com.asejnr;

import jakarta.persistence.*;

@Entity
@Table(name = "alien_table")
public class Alien {
    @Id
    private int aid;
    @Column(name = "alien_name")
    private String name;
    @Column(name = "alien_color")
    private String color;
    @Transient
    private  int age;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
