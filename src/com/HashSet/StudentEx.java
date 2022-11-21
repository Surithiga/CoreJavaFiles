package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentEx {
    public static void main(String[] args) {
        HashSet<String>studentHashSet=new HashSet<String>();

        studentHashSet.add("vini");
        studentHashSet.add("surithi");
        studentHashSet.add("selvi");
        studentHashSet.add("vini");
        studentHashSet.add("selvi");

        System.out.println(studentHashSet);
        System.out.println(studentHashSet.size());

        ArrayList<String> studentArrayList=new ArrayList<String>();

        studentArrayList.add("vini");
        studentArrayList.add("surithi");
        studentArrayList.add("selvi");
        studentArrayList.add("vini");
        studentArrayList.add("selvi");

        System.out.println(studentArrayList);
        System.out.println(studentArrayList.size());
    }
}
