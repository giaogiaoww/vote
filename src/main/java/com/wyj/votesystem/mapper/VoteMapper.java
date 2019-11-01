package com.wyj.votesystem.mapper;

import com.wyj.votesystem.pojo.Item;
import com.wyj.votesystem.pojo.Options;
import com.wyj.votesystem.pojo.Subject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteMapper {
    List<Subject> findAll(@Param("sid") int sid);

    int check(Item it);

    int tp(Item it);

    int addSubject(Subject s);

    int addOptions(@Param("ocontent") String ocontent);

    int update(@Param("sid")int sid,@Param("ocontent")String op);

    List<Subject> findByTitle(@Param("title")String title);
}
