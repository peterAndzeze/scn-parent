package com.sw.study.scn.resume.service;

import com.sw.study.scn.pojo.Resume;

/**
 * @author sw
 */
public interface ResumeService {
    Resume findDefaultResumeByUserId(Long userId);

}
