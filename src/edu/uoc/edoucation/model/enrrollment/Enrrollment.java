package edu.uoc.edoucation.model.enrrollment;

import edu.uoc.edoucation.model.Status;
import edu.uoc.edoucation.model.group.Student;
import edu.uoc.edoucation.model.subject.Subject;

import java.util.List;

public class Enrrollment {
    private Subject subject;
    private String semester;
    private Status status;
    private double grade;
    private List<Student> students;

    // Constructors, getters, setters, and other methods
}
