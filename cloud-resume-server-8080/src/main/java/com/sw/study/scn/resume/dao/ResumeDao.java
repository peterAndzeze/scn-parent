package com.sw.study.scn.resume.dao;

import com.sw.study.scn.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDao extends JpaRepository<Resume,Long> {
}
