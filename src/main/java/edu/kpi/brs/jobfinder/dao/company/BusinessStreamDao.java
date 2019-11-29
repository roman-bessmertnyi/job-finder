package edu.kpi.brs.jobfinder.dao.company;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.kpi.brs.jobfinder.model.company.BusinessStream;

public interface BusinessStreamDao extends JpaRepository<BusinessStream, Integer> {

}
