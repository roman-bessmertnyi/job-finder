package edu.kpi.brs.jobfinder.dao.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.kpi.brs.jobfinder.model.job.JobPostChangelog;

@Repository
public interface JobPostChangelogDao extends JpaRepository<JobPostChangelog, Integer> {

}