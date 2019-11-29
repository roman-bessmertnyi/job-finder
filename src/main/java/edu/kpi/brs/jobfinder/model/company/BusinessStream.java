package edu.kpi.brs.jobfinder.model.company;
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
 * BusinessStream generated by hbm2java
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "business_stream")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BusinessStream implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3863447623084456732L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "business_stream_generator")
    @SequenceGenerator(name = "business_stream_generator", sequenceName = "business_stream_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "business_stream_name", nullable = false, length = 100)
    private String businessStreamName;

    @Column(name = "business_stream_name", nullable = false, length = 100)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "businessStream")
    private Set<Company> companies = new HashSet<>(0);
}
