package com.example.school.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long personId;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "hire_date")
    private Date hireDate;
    @Column(name = "enrollment_date")
    private Date EnrollmentDate;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "instructorId")
    private OfficeAssignment officeAssignment;
    @OneToMany(mappedBy = "personId")
    private Set<CourseInstructor> courseInstructors;
    @OneToMany(mappedBy = "studentId")
    private Set<StudentGrade> studentGrades;
}