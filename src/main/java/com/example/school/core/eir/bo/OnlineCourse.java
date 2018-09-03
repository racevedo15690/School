package com.example.school.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "course_id")
public class OnlineCourse extends Course {
    private String url;
}