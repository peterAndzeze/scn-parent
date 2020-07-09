package com.sw.study.scn.resume.service.impl;

import com.sw.study.scn.pojo.Resume;
import com.sw.study.scn.resume.dao.ResumeDao;
import com.sw.study.scn.resume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public Resume findDefaultResumeByUserId(Long userId) {
        Resume resume = new Resume();
        resume.setUserId(userId);
        // 查询默认简历
        resume.setIsDefault(1);
        Example<Resume> example = Example.of(resume);
        Resume resume1 = resumeDao.findOne(example).get();
        return resume1;
    }
}
