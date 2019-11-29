package edu.kpi.brs.jobfinder.dao.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kpi.brs.jobfinder.model.job.Location;

@Repository
public interface LocationDao extends JpaRepository<Location, Integer> {

}
