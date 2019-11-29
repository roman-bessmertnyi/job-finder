package edu.kpi.brs.jobfinder.dao.seeker;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.kpi.brs.jobfinder.model.seeker.SeekerSkillSet;

public interface SeekerSkillSetDao extends JpaRepository<SeekerSkillSet, Integer> {

}
