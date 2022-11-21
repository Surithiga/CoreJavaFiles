package com.HashMap;

import java.util.HashMap;

public class Student1 {
    public static void main(String[] args) {
        HashMap<Integer,Student>studentHashMap=new HashMap<>();
        Student s1=new Student("selvi",35);
        Student s2=new Student("Surithi",23);
        Student s3=new Student("vini",13);
        Student s4=new Student("Udhaya",25);

        studentHashMap.put(89,s1);
        studentHashMap.put(34,s2);
        studentHashMap.put(11,s3);
        studentHashMap.put(97,s4);

        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}
