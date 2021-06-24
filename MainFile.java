package com.tts;

import java.util.ArrayList;
import java.util.Scanner;


public class MainFile {
    public static void main(String[] args) {
//        Integer num = new Integer(5);
//        System.out.println(num.getClass());
//        System.out.println(num);

//example of dot notation method
//        String word = new String("hello");
//        System.out.println(word);
//        System.out.println(word.getClass());
Person firstPerson = new Person();
Person secondPerson = new Person("John");
Person thirdPerson = new Person("Jane", 45, "London");
Person fourthPerson = new Person("Michael", 31);

thirdPerson.sayHello();
secondPerson.sayHello();
firstPerson.sayHello();
fourthPerson.sayHello();

        System.out.println("Jane will be " + thirdPerson.birthday() + " years old next year!");
        System.out.println("John will be " + secondPerson.birthday() + " years old next year!");
        System.out.println("Null will be " + firstPerson.birthday() + " years old next year!");
        System.out.println("Michael will be " + fourthPerson.birthday() + " years old next year!");

        MathClass math = new MathClass();
         math.reallyHardMath();

        System.out.println("Jane was born in" + thirdPerson.birthYear(2021));
        System.out.println("Michael was born in" + fourthPerson.birthYear(2021));

        System.out.println(firstPerson.name);
        System.out.println(secondPerson.name);
        System.out.println(thirdPerson.name);
        System.out.println(fourthPerson.name);

            Student new_student = new Student();
            new_student.name = "Mike";
            new_student.age = 20;
            new_student.gradYear = 2020;
            System.out.println("Name: " + new_student.name + "\nAge: "
                    + new_student.age +"\nGraduation Year: " + new_student.gradYear
                    + "\nEnrolled? " + new_student.enrolled);

        System.out.println("Name" + new_student.name + "\nAge:" + new_student.age +
                "\nGraduation Year:" + new_student.gradYear +
                "\nEnrolled?" + new_student.enrolled);

        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student();
        student1.name = "Mickey";
        student1.age = 21;
        student1.gradYear = 2021;

        studentList.add(student1);

// adding student2 to our arrayList
        Student new_student2 = new Student();
        new_student2.name = "Janice";
        new_student2.age = 32;
        new_student2.gradYear = 2019;

// checking our student list
        studentList.add(new_student2);

        System.out.println(studentList.size());


        System.out.println("\nStudent constructor");

        Student student3 = new Student("Heather", 31, 2014, true);
        Student student4 = new Student ("Angela", 43, 1996, false);
        Student student5 = new Student ("Daniel", 33, 2002, true);
        Student student6 = new Student ("Ronald", 19, 2021, false);

        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        // enhanced for loop
        for (Student s : studentList){
            System.out.println("Name: " + s.name + "\nAge: " +
                    s.age +"\nGraduation Year: " + s.gradYear +
                    "\nEnrolled? " + s.enrolled);
        }

        String name;
        int age;
        boolean enrolled;
        boolean complete = false;

        while( complete = false){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Name:");
            String name = input.nextLine();
            System.out.println("Enter Age:");
            String age = input.nextLine();
            System.out.println("Year of Graduation:");
            String gradYear = input.nextLine();
            System.out.println("Enrolled (enter true or false):");
            String enrolled = input.nextLine();

            System.out.println("Your name is:" + name + "and your age is:" + age  + "you graduated in"+ gradYear + "\n Enrolled?" +  enrolled);
            complete = true;

        }
    }
    }

