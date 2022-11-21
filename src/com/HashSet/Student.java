package com.HashSet;

public class Student {
    private String name;
    private String location;
    private int standard;

    public Student(String name, String location,int standard){
        this.name=name;
        this.location=location;
        this.standard=standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}
