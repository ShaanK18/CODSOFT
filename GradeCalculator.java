package com.codsoft;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("** Welcome To Student Grade Calculator **");
        System.out.println("Here, You just need to enter number of subjects and marks for each Subject. ");
        System.out.println("So you get all the grade calculation of your Marks");
        System.out.println();

        System.out.println("Enter the number of subjects:");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numOfSubjects;

        String grade = calculateGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }

    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B+";
        } else if (averagePercentage >= 60) {
            return "B";
        } else if (averagePercentage >= 50) {
            return "C+";
        } else if (averagePercentage >= 40) {
            return "C";
        } else if (averagePercentage >= 30) {
            return "D";
        } else {
            return "F";
        }
    }
}


