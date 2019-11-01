package com.wyj.votesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/for")
public class ForController {
    @RequestMapping("/votelist")
    public String votelist(){
        return "votelist";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }
}
