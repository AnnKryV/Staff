package org.example.app.entities;

public class StuffInfo {

    private final String name;
    private final String position;
    private final String phone;
    private final double salary;

    public StuffInfo(String name, String position, String phone, double salary){
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public String getPhone(){
        return phone;
    }
    public double getSalary(){
        return salary;
    }
}
