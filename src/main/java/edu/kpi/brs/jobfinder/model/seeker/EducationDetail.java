package edu.kpi.brs.jobfinder.model.seeker;
// Generated 22.06.2018 15:44:18 by Hibernate Tools 5.2.10.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * EducationDetail generated by hbm2java
 */

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "education_detail")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EducationDetail implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8795315701255250794L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "education_detail_generator")
    @SequenceGenerator(name = "education_detail_generator", sequenceName = "education_detail_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "certificate_degree_name", nullable = false, length = 50)
    private String certificateDegreeName;

    @Column(name = "major", nullable = false, length = 50)
    private String major;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seeker_id", nullable = false)
    private SeekerProfile seekerProfile;

    @Column(name = "institute_university_name", nullable = false, length = 50)
    private String instituteUniversityName;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "starting_date", nullable = false, length = 13)
    private Date startingDate;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "completion_date", length = 13)
    private Date completionDate;

    @Column(name = "description", length = 2000)
    private String description;

    @Column(name = "image_path", length = 200)
    private String imagePath;
}
