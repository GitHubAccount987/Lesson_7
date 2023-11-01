package com.example.lesson_7;

import java.util.HashMap;

public class Student {

    private String name;
    private String surname;

    private HashMap<String, Subject> subjects;

    public Student(String name, String surname) {

        this.name = name;
        this.surname = surname;
        this.subjects = new HashMap<>();

    }

    public void addGrade(String subject, int grade) {

        if (!subjects.containsKey(subject)) subjects.put(subject, new Subject(subject));

        subjects.get(subject).getMarks().add(grade);

    }

    public double getAverageGrade(String subject) {

        double averageGrade = 0;

        Subject subjectObject = subjects.get(subject);

        int marksSize = subjectObject.getMarks().size();

        for (int grade : subjectObject.getMarks()) averageGrade += grade;

        averageGrade /= marksSize == 0 ? 1 : marksSize;

        return averageGrade;
    }
}
