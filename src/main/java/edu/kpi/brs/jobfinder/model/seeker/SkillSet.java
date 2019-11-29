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
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * SkillSet generated by hbm2java
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "skill_set")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class SkillSet implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8482556936476896093L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skill_set_generator")
    @SequenceGenerator(name = "skill_set_generator", sequenceName = "skill_set_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "skill_set_name", nullable = false, length = 50)
    private String skillSetName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "skillSet")
    private Set<SeekerSkillSet> seekerSkillSets = new HashSet<SeekerSkillSet>(0);
}