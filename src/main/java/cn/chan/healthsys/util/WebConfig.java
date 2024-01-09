package cn.chan.healthsys.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//全局配置类--配置跨域请求
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                //vue的端口通常是8080
                .allowedOrigins("Http://localhost:8080","null")
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
