package org.example;

import java.util.ArrayList;
import java.util.List;

public class CU {
    private String nameCU;
    private List<Mark> marks;
    private int totalStudents;

    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>();
    }

    // Insert mark for a student
    public void insertMarkCU(int numStudent, double mark) {
        marks.add(new Mark(numStudent, mark));
    }

    // Search for a student's mark
    public double searchStudent(int numStudent) {
        for (Mark m : marks) {
            if (m.getNumStudent() == numStudent) {
                return m.getMark();
            }
        }
        return -1; // Student not found
    }

    // Calculate average mark of the CU
    public double averageCU() {
        double sum = 0;
        for (Mark m : marks) {
            sum += m.getMark();
        }
        return marks.size() > 0 ? sum / marks.size() : 0;
    }

    // Check if a student passed the course
    public boolean isApproved(int numStudent) {
        double mark = searchStudent(numStudent);
        return mark >= 9.5;
    }
}
