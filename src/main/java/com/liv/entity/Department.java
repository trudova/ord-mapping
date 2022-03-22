package com.liv.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Getter
@Setter
public class Department extends BaseModel {

    private String department;
    private String division;
//    @OneToOne(mappedBy = "department")
//    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
