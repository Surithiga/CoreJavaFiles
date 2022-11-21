package com.ArrayListExercise;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Student1 {
    public static void main(String[] args) {
        Student student1 = new Student("Surithi", 2, 958567985, "Female", "Yes", "No", "Londan", 7, 10082);
        Student student2 = new Student("Selvi", 10, 877848855, "Female", "Yes", "Yes", "Ond", 15, 10080);
        Student student3 = new Student("Udhaya", 12, 638268441, "Female", "Yes", "No", "Tnj", 17, 10084);
        Student student4 = new Student("Dharshini", 5, 936038386, "Female", "No", "Yes", "Singai", 10, 10084);
        Student student5 = new Student("Vinitha", 7, 958521766, "Female", "No", "No", "Londan", 12, 10081);
        Student student6 = new Student("Ahalya", 11, 93445207, "Female", "Yes", "Yes", "Tnj", 16, 10061);
        Student student7 = new Student("Sundhari", 9, 999452439, "Female", "No", "Yes", "Pondichery", 14, 10097);
        Student student8 = new Student("Shenbag", 2, 848932284, "Male", "No", "No", "Us", 7, 10021);
        Student student9 = new Student("Pradeep", 1, 915923845, "Male", "No", "Yes", "Kumbakonam", 6, 10058);
        Student student10 = new Student("Raj", 1, 637902342, "Male", "Yes", "Yes", "Ond", 6, 10022);
        Student student11 = new Student("Jothika", 3, 848944913, "Female", "Yes", "No", "Pondichery", 8, 10099);
        Student student12 = new Student("Kiruba", 4, 863769996, "Male", "Yes", "No", "Singai", 9, 10023);
        Student student13 = new Student("Seetha", 6, 962636680, "Male", "No", "Yes", "Bangalore", 11, 10024);
        Student student14 = new Student("Sanjai", 5, 853184249, "Male", "Yes", "No", "Kumbakonam", 10, 10062);
        Student student15 = new Student("Gangai", 7, 853184250, "Male", "No", "Yes", "Bangalore", 12, 63);


        ArrayList<Student> list = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);
        list.add(student13);
        list.add(student14);
        list.add(student15);

        System.out.println("student count: " + getStudentByCount(list, 2));
        System.out.println("gender count: " + getGenderByCount(list, "Female"));
        System.out.println("standard gender count: " + getStandardByGenderCount(list, 5, "Male"));
        System.out.println("total age: " + getTotalAge(list, 2));
        System.out.println("age range: " + ageRange(list, 17));
        nameStartWithA(list);
        wearSpecs(list);
    }

    public static int getStudentByCount(ArrayList<Student> list, int standard) {
        int count = 0;
        for (Student student1 : list) {
            if (student1.getStandard() == standard) {
                count++;
            }
        }
        return count;
    }

    public static int getGenderByCount(ArrayList<Student> list, String gender) {
        int count = 0;
        for (Student student1 : list) {
            if (student1.getGender() == gender) {
                count++;
            }
        }
        return count;
    }

    public static int getStandardByGenderCount(ArrayList<Student> list, int standard, String gender) {
        int count = 0;
        for (Student student1 : list) {
            if (student1.getStandard() == standard && student1.getGender() == gender) {
                count++;
            }
        }
        return count;
    }

    public static int getTotalAge(ArrayList<Student> list, int standard) {
        int sum = 0;
        for (Student student1 : list) {
            if (student1.getStandard() == standard) {
                sum += student1.getAge();
            }
        }
        return sum;
    }

    public static int ageRange(ArrayList<Student> list, int age) {
        int count = 0;
        for (Student student1 : list) {
            if (student1.getAge() == age) {
                count++;
            }
        }
        return count;
    }

    public static void nameStartWithA(ArrayList<Student> list) {
        for (Student student1 : list) {
            if (student1.getName().startsWith("A")) {
                System.out.println(student1.getName());

            }
        }
    }

    public static void wearSpecs(ArrayList<Student> list) {
        String name = "";
        for (Student student1 : list) {
            if (student1.getWearSpecs() == "Yes") {
                name = student1.getName();
                System.out.print(name + "  ");
            }
        }
    }

}
