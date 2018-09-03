package com.example.school.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "course_id")
public class OnsiteCourse extends Course {
    private String location;
    private String days;
    private Date times;
}