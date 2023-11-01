package com.example.lesson_7;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class HelloController {

    HashMap<String, Student> students = new HashMap<>();

    @FXML
    private TextField nameToSave, surnameField, subjectField, gradeField, nameToSearch, surnameToFind, subjectToSearch;

    @FXML
    private Label averageGradeLabel;

    @FXML
    private void onSaveClick() {

        int grade = Character.getNumericValue(gradeField.getText().toCharArray()[0]);

        if (grade < 1 || grade > 5) {

            System.out.println("Grade isn't within range <1, 5>");

            return;
        }

        String name = (nameToSave.getText() + surnameField.getText()), subject = subjectField.getText();

        // If the student isn't in the students HashMap create a Student and add it to the HashMap
        if (!students.containsKey(name)) students.put(name, new Student(name, surnameField.getText()));

        Student currentStudent = students.get(name);

        currentStudent.addGrade(subject, grade);

    }

    @FXML
    private void onShowGradeClick() {

        averageGradeLabel.setText(subjectToSearch.getText() + ": " + String.format("%.2f", (float)students.get(nameToSearch.getText() + surnameToFind.getText()).getAverageGrade(subjectToSearch.getText())));

    }

}