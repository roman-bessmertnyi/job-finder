package edu.kpi.brs.jobfinder.model.job;
// Generated 22.06.2018 15:44:18 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * JobType generated by hbm2java
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "job_type")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class JobType implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 809827647209111133L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_type_generator")
    @SequenceGenerator(name = "job_type_generator", sequenceName = "job_type_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "job_type", nullable = false, length = 20)
    private String jobType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jobType")
    private Set<JobPost> jobPosts = new HashSet<>(0);
}
