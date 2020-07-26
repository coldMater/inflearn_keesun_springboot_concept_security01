package com.coldmater.spring_boot_security_test;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //hello 요청이 오면 hello 뷰를 연결해준다.
        //HomeContorller 의 hello 컨트롤러 API 와 동일한 효과이다.
        //Conroller 에서 아무런 일도 하지 않으면 이렇게 처리해줘도 좋다.
        //registry.addViewController("/hello").setViewName("hello");
    }
}
