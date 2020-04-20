package com.lagou.service.impl;

import com.lagou.dao.ResumeDao;
import com.lagou.entity.Resume;
import com.lagou.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: fengyibo
 * @date: 2020/4/19 17:40
 * @description:
 */
@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public List<Resume> findList() {
        return resumeDao.findAll();
    }

    @Override
    public void addResume(Resume resume) {
        resumeDao.save(resume);
    }

    @Override
    public void deleteResume(Long id) {
        resumeDao.deleteById(id);
    }

    @Override
    public void updateResume(Resume resume) {
        resumeDao.save(resume);
    }
}
