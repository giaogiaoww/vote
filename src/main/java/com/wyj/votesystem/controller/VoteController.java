package com.wyj.votesystem.controller;

import com.github.pagehelper.Page;
import com.wyj.votesystem.pojo.Item;
import com.wyj.votesystem.pojo.Subject;
import com.wyj.votesystem.service.serviceimpl.VoteServiceImpl;
import org.apache.ibatis.ognl.DynamicSubscript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/vote")
public class VoteController {

    @Autowired
    private VoteServiceImpl vs;

    @RequestMapping("/load")
    @ResponseBody
    public List<Object> load(int index){
        Page<Object> all = vs.findAll(0, index);
        all.getResult().add(all.getPages());
        return all.getResult();
    }

    @RequestMapping("/findById")
    public String findById(Model m,int id){
        m.addAttribute("vote",vs.findAll(id,1));
        return "vote";
    }

    @RequestMapping("/check")
    @ResponseBody
    public String check(Item it){
        if(vs.check(it)){
            return "ok";
        }else {
            return "no";
        }
    }

    @RequestMapping("/tp")
    @ResponseBody
    public Map<String,Object> tp(Item it){
        Map<String,Object> map=new HashMap<>();
        String mess="投票失败";
        String url="/vote/findById"+it.getSid();
        if(vs.tp(it)){
            mess="投票成功";
            url="/for/votelist";
        }
        map.put("mess",mess);
        map.put("url",url);
        return map;
    }

    @RequestMapping("/ck")
    public String ck(int sid,Model m){
        m.addAttribute("vote",vs.findAll(sid,1));
        return "voteview";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> add(Subject s,String ops){
        Map<String,Object> map=new HashMap<>();
        String mess="新增失败";
        String url="/for/add";
        if(vs.add(s,ops)){
            mess="新增成功";
            url="/for/votelist";
        }
        map.put("mess",mess);
        map.put("url",url);
        return map;
    }

    @RequestMapping("/Maintain")
    public String Maintain(int id,Model m){
        m.addAttribute("vote",vs.findAll(id,1));
        return "update";
    }

    @RequestMapping("/update")
    @ResponseBody
    public Map<String,Object> update(int sid,String ops){
        Map<String,Object> map=new HashMap<>();
        String mess="修改失败";
        String url="/for/Maintain?id="+sid;
        if(vs.update(sid,ops)){
            mess="修改成功";
            url="/for/votelist";
        }
        map.put("mess",mess);
        map.put("url",url);
        return map;
    }

    @RequestMapping("/findByTitle")
    @ResponseBody
    public List<Subject> findByTitle(String title){

        return vs.findByTitle(title);
    }
}