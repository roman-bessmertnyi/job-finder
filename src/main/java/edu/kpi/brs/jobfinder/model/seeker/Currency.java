package edu.kpi.brs.jobfinder.model.seeker;
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
import edu.kpi.brs.jobfinder.model.job.JobPost;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Currency generated by hbm2java
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "currency")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Currency implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1866765345799092159L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_generator")
    @SequenceGenerator(name = "currency_generator", sequenceName = "currency_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "currency_name", nullable = false, length = 20)
    private String currencyName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
    private Set<JobPost> jobPosts = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
    private Set<SeekerProfile> seekerProfiles = new HashSet<>(0);
}
