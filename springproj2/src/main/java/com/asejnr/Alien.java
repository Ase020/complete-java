package com.asejnr;


public class Alien {
    private int age;
    private Computer computer;

    public  Alien(){
        System.out.println("Alien Object Created...");
    }



    public void code(){
        System.out.println("I'm coding...");
        computer.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                '}';
    }
}
