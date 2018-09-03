package com.example.school.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "office_assignment")
public class OfficeAssignment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id", nullable = false)
    private Long instructorId;
    @Column(name = "location")
    private String location;
    @Column(name = "timestamp")
    private Timestamp timestamp;
    @OneToOne(mappedBy = "officeAssignment")
    private Person person;
}