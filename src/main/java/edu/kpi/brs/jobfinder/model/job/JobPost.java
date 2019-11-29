package edu.kpi.brs.jobfinder.model.job;
// Generated 22.06.2018 15:44:18 by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import edu.kpi.brs.jobfinder.model.company.Company;
import edu.kpi.brs.jobfinder.model.seeker.Currency;
import edu.kpi.brs.jobfinder.model.user.UserAccount;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * JobPost generated by hbm2java
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "job_post")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class JobPost implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7552630640484962288L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_post_generator")
    @SequenceGenerator(name = "job_post_generator", sequenceName = "job_post_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id", nullable = false)
    private Currency currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_degree_id", nullable = false)
    private JobDegree jobDegree;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_type_id", nullable = false)
    private JobType jobType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "posted_by_id", nullable = false)
    private UserAccount userAccount;

    @Column(name = "job_title", nullable = false, length = 200)
    private String jobTitle;

    @Column(name = "is_company_name_hidden", nullable = false)
    private boolean isCompanyNameHidden;

    @Column(name = "description", nullable = false, length = 2000)
    private String description;

    @Column(name = "application_website", nullable = false, length = 200)
    private String applicationWebsite;

    @Column(name = "salary", nullable = false)
    private int salary;

    @Column(name = "working_hours", nullable = false)
    private int workingHours;

    @Column(name = "experience_years", nullable = false)
    private int experienceYears;

    @Column(name = "job_detail", nullable = false, length = 4000)
    private String jobDetail;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "created_date", nullable = false, length = 13)
    private Date createdDate;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "cover_image_path", nullable = false, length = 200)
    private String coverImagePath;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jobPost")
    private Set<JobPostActivity> jobPostActivities = new HashSet<>(0);
}
