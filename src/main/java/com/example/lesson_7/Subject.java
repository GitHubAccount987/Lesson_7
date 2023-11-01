package com.example.lesson_7;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;

    private List<Integer> marks;

    public Subject(String name) {

        this.name = name;
        this.marks = new ArrayList<>();

    }

    public List<Integer> getMarks() { return marks; }
}
