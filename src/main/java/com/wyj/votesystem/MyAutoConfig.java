package com.wyj.votesystem;

import com.wyj.votesystem.mvc.MyInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyAutoConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyInterceptor mi=new MyInterceptor();
        registry.addInterceptor(mi).addPathPatterns("/**");
    }
}
