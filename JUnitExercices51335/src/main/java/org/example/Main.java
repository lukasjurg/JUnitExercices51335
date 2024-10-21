package org.example;

public class Main {
    public static void main(String[] args) {
        // Exercise 2
        NumberUtils numberUtils = new NumberUtils();

        // Testing isPrime
        System.out.println("Prime Number Test:");
        int[] primesToTest = {3, 23, 311, 487, 653, 947, 21, 25};
        for (int num : primesToTest) {
            System.out.println(num + " is prime: " + numberUtils.isPrime(num));
        }

        // Testing isEven
        System.out.println("\nEven Number Test:");
        int[] evensToTest = {32, 64, 2, 20, 30, 26, 11, 23};
        for (int num : evensToTest) {
            System.out.println(num + " is even: " + numberUtils.isEven(num));
        }

        // Testing isMultiple
        System.out.println("\nMultiples of 23 Test:");
        int[][] multiplesToTest = {{23, 23}, {46, 23}, {115, 23}, {184, 23}, {207, 23}, {230, 23}, {45, 23}, {99, 23}};
        for (int[] test : multiplesToTest) {
            System.out.println(test[0] + " is a multiple of " + test[1] + ": " + numberUtils.isMultiple(test[0], test[1]));
        }

        // Exercise 3
        CU mathCourse = new CU("Mathematics", 20);

        // Inserting marks for students
        mathCourse.insertMarkCU(1, 15.0);
        mathCourse.insertMarkCU(2, 12.5);
        mathCourse.insertMarkCU(3, 8.0);

        // Searching for a student's mark
        System.out.println("\nSearch Student Marks:");
        System.out.println("Mark of student 1: " + mathCourse.searchStudent(1));
        System.out.println("Mark of student 2: " + mathCourse.searchStudent(2));
        System.out.println("Mark of student 3: " + mathCourse.searchStudent(3));

        // Calculating average CU mark
        System.out.println("\nAverage mark of the course: " + mathCourse.averageCU());

        // Checking if students passed the course
        System.out.println("\nStudent Pass Status:");
        System.out.println("Student 1 passed: " + mathCourse.isApproved(1));
        System.out.println("Student 2 passed: " + mathCourse.isApproved(2));
        System.out.println("Student 3 passed: " + mathCourse.isApproved(3));

    }
}
