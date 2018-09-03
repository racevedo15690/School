package com.example.school.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "course_instructor")
public class CourseInstructor implements Serializable {
    @EmbeddedId
    private CourseIntructorId courseIntructorId;
    @ManyToOne
    @JoinColumn(name = "codigo_person_id", referencedColumnName = "person_id",nullable = false,insertable = false,updatable = false)
    private Person personId;
    @ManyToOne
    @JoinColumn(name = "codigo_course_id", referencedColumnName = "course_id",nullable = false,insertable = false,updatable = false)
    private Course courseId;
}
