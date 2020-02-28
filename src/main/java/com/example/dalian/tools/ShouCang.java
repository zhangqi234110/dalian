package com.example.dalian.tools;

import com.example.dalian.intercepter.ShouCangIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by 张齐 on 2020/2/26 14:23
 */
@Configuration
public class ShouCang implements WebMvcConfigurer {

    @Autowired
    private ShouCangIntercepter shouCangIntercepter;

    // 这个方法是用来配置静态资源的，比如html，js，css，等等

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }



    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效

    @Override

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(shouCangIntercepter).addPathPatterns("/weather/search");

    }
}
