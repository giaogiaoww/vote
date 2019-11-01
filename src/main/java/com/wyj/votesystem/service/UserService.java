package com.wyj.votesystem.service;

import com.wyj.votesystem.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User login(User u);

    boolean checkName(String username);

    boolean regs(User u);
}
