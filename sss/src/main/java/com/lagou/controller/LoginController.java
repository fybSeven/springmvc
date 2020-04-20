package com.lagou.controller;

import com.lagou.entity.Resume;
import com.lagou.entity.User;
import com.lagou.service.ResumeService;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: fengyibo
 * @date: 2020/4/19 14:16
 * @description:
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response, String username, String password, ModelMap map){
        User user = userService.findByUsername(username);
        if (user == null || !user.getPassword().equals(password)){
            map.put("data", "账户或密码错误");
            return "error";
        }
        request.getSession().setAttribute("username", username);
        return "list";
    }

    @RequestMapping("/findList")
    @ResponseBody
    public Object findList(){
        return resumeService.findList();
    }

    @RequestMapping("/update")
    public String update(String id, ModelMap map){
        map.put("id", id);
        return "update";
    }

    @RequestMapping("/list")
    public String list(){
        return "list";
    }

    @RequestMapping("/addResume")
        public void addResume(HttpServletResponse response, String address, String name, String phone){
        Resume resume = new Resume();
        resume.setName(name);
        resume.setAddress(address);
        resume.setPhone(phone);
        resumeService.addResume(resume);
        try {
            response.sendRedirect("/sss_war/user/list");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/deleteResume")
    @ResponseBody
    public void deleteResume(String id){
        resumeService.deleteResume(Long.parseLong(id));
    }

    @RequestMapping("/updateResume")
    public String updateResume(String id, String address, String name, String phone){
        System.out.println(id + "#####");
        Resume resume = new Resume();
        resume.setId(Long.parseLong(id));
        resume.setAddress(address);
        resume.setPhone(phone);
        resume.setName(name);
        resumeService.addResume(resume);
        return "list";
    }
}
