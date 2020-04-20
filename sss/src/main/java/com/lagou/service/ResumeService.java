package com.lagou.service;

import com.lagou.entity.Resume;

import java.util.List;

/**
 * @author: fengyibo
 * @date: 2020/4/19 17:40
 * @description:
 */
public interface ResumeService {

    List<Resume> findList();

    void addResume(Resume resume);

    void deleteResume(Long id);

    void updateResume(Resume resume);
}
