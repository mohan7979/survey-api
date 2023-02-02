package com.magnit.survey;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@ToString
@Entity
@Table(name = "EMPLOYEE_SURVEY")
public class EmployeeSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String empId;
    private String designation;
    private String department;
    private String jobSatisfaction;
    private Boolean valueAtWork;
    private String valueAtWorkComments;
    private Boolean stressAnxiety;
    private String stressComments;
    private Integer workBalance;
    private Integer appraisalRating;
    private Integer hybridModel;
    private Integer companyPolicy;

}
