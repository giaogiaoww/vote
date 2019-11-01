package com.wyj.votesystem.service;

import com.github.pagehelper.Page;
import com.wyj.votesystem.pojo.Item;
import com.wyj.votesystem.pojo.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VoteService {
    Page<Object> findAll(int sid,int index);

    boolean check(Item it);

    boolean tp(Item it);

    boolean add(Subject s,String ops);

    boolean update(int sid,String ops);

    List<Subject> findByTitle(String title);
}
