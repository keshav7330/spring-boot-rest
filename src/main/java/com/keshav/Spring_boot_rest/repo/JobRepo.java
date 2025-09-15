package com.keshav.Spring_boot_rest.repo;


import com.keshav.Spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
       new JobPost(1,"java dev","must have good dsa skills",1,Arrays.asList("Java", "Spring Boot", "DSA"))
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJobs(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }

    public JobPost getJob(int postId) {

        for(JobPost job : jobs){
            if(job.getPostId() == postId){
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1 : jobs) {
            if(jobPost1.getPostId() == jobPost.getPostId()){
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }

    }

    public void deleteJob(int postId) {
        for(JobPost jobPost : jobs) {
            if(jobPost.getPostId() == postId){
                jobs.remove(jobPost);
            }
        }
    }
}
