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
 * JobDegree generated by hbm2java
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "job_degree")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class JobDegree implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2326717916045712165L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_degree_generator")
    @SequenceGenerator(name = "job_degree_generator", sequenceName = "job_degree_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "degree_name", nullable = false, length = 20)
    private String degreeName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jobDegree")
    private Set<JobPost> jobPosts = new HashSet<JobPost>(0);
}