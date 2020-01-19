package org.zhoup.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("org.zhoup.service.mapper")
@SpringBootApplication
@ServletComponentScan(basePackages = "org.zhoup.service.config")
public class BwcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BwcarApplication.class, args);
    }

}
