package com.wyj.votesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan(basePackages = "com.wyj.votesystem.mapper")
@ServletComponentScan(basePackages = "com.wyj.votesystem.web")
public class VotesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VotesystemApplication.class, args);
    }

}
