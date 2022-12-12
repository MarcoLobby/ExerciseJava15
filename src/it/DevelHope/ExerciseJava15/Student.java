package it.DevelHope.ExerciseJava15;

import java.util.Random;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void guessingAge(){
        int randomInteger = new Random().nextInt(35);
        System.out.println("I generated the random number " + randomInteger + " for " + name);
        if (randomInteger == age){
            System.out.println("The random number generated is equals to Student's age.");
        } else if (randomInteger >= age){
            System.out.println("The random number generated is greater than the Student's age.");
        }else{
            System.out.println("The random number generated is lower than the Student's age.");
        }
    }


}
