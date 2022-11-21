package com.ArrayListExercise;

public class Student {
    private String name;
    private int standard;
    private int mobileNO;
    private String gender;
    private String wearSpecs;
    private String hostel;
    private String city;
    private int age;
    private int id;

    public Student(String name, int standard, int mobileNO, String gender, String wearSpecs, String hostel, String city, int age, int id) {
        this.name = name;
        this.standard = standard;
        this.mobileNO = mobileNO;
        this.gender = gender;
        this.wearSpecs = wearSpecs;
        this.hostel = hostel;
        this.city = city;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(int mobileNO) {
        this.mobileNO = mobileNO;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWearSpecs() {
        return wearSpecs;
    }

    public void setWearSpecs(String wearSpecs) {
        this.wearSpecs = wearSpecs;
    }

    public String hostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
