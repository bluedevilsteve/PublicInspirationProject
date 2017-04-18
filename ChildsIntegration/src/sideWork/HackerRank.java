package sideWork;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Student tyler = new Student("Tyler"); // creating an instance of the Student class
    Student derek = new Student("Derek");
    
    tyler.setScore(1, 100);
    
    Student[] classroom = new Student[3]; // creating an array capable of storing objects created from the Student class
    classroom[0] = tyler;
    classroom[1] = derek;
    
    for (Student aStudent : classroom) { // for each loop to go through the array holding the Student objects
        System.out.println(aStudent.getName());
        double[] studentScores = aStudent.getScores();
        for (double score : studentScores) { // for each loop to go through the array that is a field of the Student objects
            System.out.println(score);
        }
    }
  }
}

class Student {
    private String name;
    private double[] scores; // an array as the field of a class
     
    public Student(String n) { // constructor method, called automatically when new objects are created
        name = n;
        // actually create the space in memory for the array
        
    }
    
    public void setScore(int testNum, int score) {
        if (testNum >= 1 && testNum <= 3) {
            scores[testNum - 1] = score;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public double[] getScores() {
        return scores;
    }
}