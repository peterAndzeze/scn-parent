package com.sw.study.scn.resume.controller;

import com.sw.study.scn.resume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

   /* @Value("${server.port}")*/
    private Integer port;

    //"/resume/openstate/1545132"
    @GetMapping("/openstate/{userId}")
    public String findDefaultResumeState(@PathVariable Long userId) {
        System.out.println("====>>>>>>>>>>>>>>我是8081，访问到我这里了......");
        return resumeService.findDefaultResumeByUserId(userId).getIsOpenResume()+"-8081";
    }
}
