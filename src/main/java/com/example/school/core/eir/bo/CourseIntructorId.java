package com.example.school.core.eir.bo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CourseIntructorId implements Serializable{
    @Column(name = "codigo_course_id",nullable = false, insertable = false,updatable = false)
    private Long courseId;
    @Column(name = "codigo_person_id",nullable = false, insertable = false,updatable = false)
    private Long personId;
}
