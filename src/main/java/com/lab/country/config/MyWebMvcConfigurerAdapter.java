package com.lab.country.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ruin
 * @date 2019/5/27-11:25
 */

@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("landingPages/login");
        registry.addViewController("/landingPages/loginSuccess.html").setViewName("landingPages/loginSuccess");
    }

}
