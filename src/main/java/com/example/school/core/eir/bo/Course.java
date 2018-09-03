package com.example.school.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "course")
@Inheritance(strategy = InheritanceType.JOINED)
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;
    @Column(name = "title")
    private String title;
    @Column(name = "credits")
    private String credits;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;
    @OneToMany(mappedBy = "courseId")
    private Set<CourseInstructor> courseInstructors;
    @OneToMany(mappedBy = "courseId")
    private Set<StudentGrade> studentGrades;
}
