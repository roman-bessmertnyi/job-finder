package edu.kpi.brs.jobfinder.dao.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kpi.brs.jobfinder.model.company.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer> {

}