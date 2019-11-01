package com.wyj.votesystem.mapper;

import com.wyj.votesystem.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User login(User u);

    int checkName(String username);

    int addUser(User u);
}
