package edu.kpi.brs.jobfinder.dao.seeker;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.kpi.brs.jobfinder.model.seeker.EducationDetail;

public interface EducationDetailDao extends JpaRepository<EducationDetail, Integer> {

}
