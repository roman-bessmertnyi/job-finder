package edu.kpi.brs.jobfinder.model.user;
// Generated 22.06.2018 15:44:18 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * UserType generated by hbm2java
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "user_type")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UserType implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2518841929112900683L;
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "user_type_name", nullable = false, length = 20)
    private String userTypeName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userType")
    private Set<UserAccount> userAccounts = new HashSet<>(0);
}
