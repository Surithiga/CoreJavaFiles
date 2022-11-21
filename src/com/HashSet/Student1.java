package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Student1 {
    public static void main(String[] args) {

        Student s1 = new Student("Surithi", "tkr", 2);
        Student s2 = new Student("vini", "ond", 3);
        Student s3 = new Student("selvi", "tmk", 4);
        Student s4 = new Student("udhaya", "ond", 5);

        HashSet<Student> studentHashSet = new HashSet<Student>();

        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);
        studentHashSet.add(s4);
        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);
        studentHashSet.add(s4);

        System.out.println(studentHashSet.size());

        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        System.out.println(studentArrayList.size());
    }
}
