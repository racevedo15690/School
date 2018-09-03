package com.example.school.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "student_grade")
public class StudentGrade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private Long enrollmentId;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courseId;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Person studentId;
    @Column(name = "grade")
    private String Grade;

}