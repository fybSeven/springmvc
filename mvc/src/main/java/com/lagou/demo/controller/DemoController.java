package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@LagouController
@LagouRequestMapping("/demo")
@Security({"admin", "user"})
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param name
     * @return
     */
    @LagouRequestMapping("/query")
    @Security({"admin", "user"})
    public String query(HttpServletRequest request, HttpServletResponse response,String name) {
        try {
            response.getWriter().write("query success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return demoService.get(name);
    }

    @LagouRequestMapping("/update")
    @Security({"admin", "user"})
    public String update(HttpServletRequest request, HttpServletResponse response,String name){
        try {
            response.getWriter().write("update success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "update success";
    }

    @LagouRequestMapping("/delete")
    @Security({"admin"})
    public String delete(HttpServletRequest request, HttpServletResponse response,String name){
        try {
            response.getWriter().write("delete success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "delete success";
    }

    @LagouRequestMapping("/insert")
    @Security({"admin"})
    public String insert(HttpServletRequest request, HttpServletResponse response,String name){
        try {
            response.getWriter().write("insert success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "insert success";
    }
}
