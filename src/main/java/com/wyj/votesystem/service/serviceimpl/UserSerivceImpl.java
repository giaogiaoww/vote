package com.wyj.votesystem.service.serviceimpl;

import com.wyj.votesystem.mapper.UserMapper;
import com.wyj.votesystem.pojo.User;
import com.wyj.votesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivceImpl  implements UserService {

    @Autowired
    private UserMapper um;

    @Override
    public User login(User u) {
        return um.login(u);
    }

    @Override
    public boolean checkName(String username) {
        return um.checkName(username)<=0;
    }

    @Override
    public boolean regs(User u) {
        return um.addUser(u)>0;
    }
}
