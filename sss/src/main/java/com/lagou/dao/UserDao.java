package com.lagou.dao;

import com.lagou.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: fengyibo
 * @date: 2020/4/19 16:57
 * @description:
 */
public interface UserDao extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

    User findByUsername(String username);
}
