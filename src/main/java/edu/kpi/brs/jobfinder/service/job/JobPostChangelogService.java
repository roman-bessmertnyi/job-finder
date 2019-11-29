package edu.kpi.brs.jobfinder.service.job;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kpi.brs.jobfinder.dao.job.JobPostChangelogDao;
import edu.kpi.brs.jobfinder.model.job.JobPost;
import edu.kpi.brs.jobfinder.model.job.JobPostChangelog;

@Service
public class JobPostChangelogService {

    @Autowired
    private JobPostChangelogDao jobPostChangelogDao;

    public JobPostChangelog logChanges(JobPost jobPost) {
        JobPostChangelog log = new JobPostChangelog();
        log.setJobPost(jobPost);
        log.setModificationTime(new Date());
        return jobPostChangelogDao.save(log);
    }
}
