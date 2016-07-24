package com.rdas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by rdas on 23/07/2016.
 */
@Slf4j
@SpringBootApplication
public class WebJsSpringBootApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebJsSpringBootApplication.class, args);
    }

//    @Bean
//    public UrlBasedViewResolver urlBasedViewResolver() {
//        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
//        resolver.setPrefix("/WEB-INF/jsp/");
//        resolver.setSuffix(".jsp");
//        resolver.setCache(false);
//        resolver.setViewClass(JstlView.class);
//        return resolver;
//    }
//    @Bean
//    public InternalResourceViewResolver getViewResolver(){
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setViewClass(JstlView.class);
//        viewResolver.setPrefix("/WEB-INF/jsp/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }

}
