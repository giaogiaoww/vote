package com.wyj.votesystem.service.serviceimpl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wyj.votesystem.mapper.VoteMapper;
import com.wyj.votesystem.pojo.Item;
import com.wyj.votesystem.pojo.Subject;
import com.wyj.votesystem.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {
    @Autowired
    private VoteMapper vm;


    @Override
    public Page<Object> findAll(int sid,int index) {
        Page<Object> objects = PageHelper.startPage(index, 2);
        vm.findAll(sid);
        return objects;
    }

    @Override
    public boolean check(Item it) {
        return vm.check(it)==0;
    }

    @Override
    public boolean tp(Item it) {
        return vm.tp(it)>0;
    }

    @Override
    public boolean add(Subject s, String ops) {
        boolean b=true;
        if(vm.addSubject(s)>0){
            String[] split = ops.split(",");
            for (String str:split){
                if(vm.addOptions(str)<=0){
                   b=false;
                }
            }
        }else{
            b=false;
        }
        return b;
    }

    @Override
    public boolean update(int sid, String ops) {
        boolean b=true;
        String[] split = ops.split(",");
        for (String str:split){
            if(vm.update(sid,str)<=0){
                b=false;
            }
        }
        return b;
    }

    @Override
    public List<Subject> findByTitle(String title){
        return vm.findByTitle(title);
    }

}
