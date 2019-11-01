package com.wyj.votesystem.controller;

import com.sun.xml.internal.ws.resources.ModelerMessages;
import com.wyj.votesystem.pojo.User;
import com.wyj.votesystem.service.serviceimpl.UserSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSerivceImpl us;


    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(User u, HttpSession session){
        Map<String,Object> map=new HashMap<>();
        User loginUser = us.login(u);
        String mess="登录失败";
        String url="login.html";
        if(loginUser!=null){
            session.setAttribute("loginUser",loginUser);
            mess="登录成功";
            url="/for/votelist";
        }
        map.put("mess",mess);
        map.put("url",url);
        return map;
    }



    @RequestMapping("/getyhm")
    @ResponseBody
    public User getyhm(HttpSession session){
        return (User)session.getAttribute("loginUser");
    }

    @RequestMapping("/Cancellation")
    public String Cancellation(HttpSession session){
        session.setAttribute("loginUser",null);
        return "redirect:/for/votelist";
    }

    @RequestMapping("/checkName")
    @ResponseBody
    public Map<String,Object> checkName(String username){
        Map<String,Object> map=new HashMap<>();
        String mess="该用户名已存在！";
        String res="no";
        if(us.checkName(username)){
            mess="该用户名可以使用！";
            res="yes";
        }
        map.put("mess",mess);
        map.put("res",res);
        return map;
    }

    @RequestMapping("/regs")
    @ResponseBody
    public Map<String,Object> regs(User u){
        Map<String,Object> map=new HashMap<>();
        String mess="注册失败";
        String url="regist.html";
        if(us.regs(u)){
            mess="注册成功";
            url="login.html";
        }
        map.put("mess",mess);
        map.put("url",url);
        return map;
    }
}
