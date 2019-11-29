package edu.kpi.brs.jobfinder.controller.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.kpi.brs.jobfinder.dao.job.JobPostDao;
import edu.kpi.brs.jobfinder.model.job.JobPost;
import edu.kpi.brs.jobfinder.model.job.JobPostChangelog;
import edu.kpi.brs.jobfinder.service.job.JobPostChangelogService;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobPostController {

    @Autowired
    private JobPostDao jobPostDao;

    @Autowired
    JobPostChangelogService jobPostChangelogService;

    @GetMapping
    public List<JobPost> getAllJobPosts() {
        return jobPostDao.findAll();
    }

    @GetMapping("/log")
    public JobPostChangelog logFirstJob() {
        JobPost firstPost = jobPostDao.findAll().get(0);
        return jobPostChangelogService.logChanges(firstPost);
    }
}
