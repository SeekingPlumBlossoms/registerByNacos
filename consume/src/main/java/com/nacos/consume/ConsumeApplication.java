package com.nacos.consume;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author yebin
 */
@SpringBootApplication
@EnableDubbo
public class ConsumeApplication {

    public static void main(String[] args)throws IOException {
        SpringApplication.run(ConsumeApplication.class, args);
        System.out.println("DemoService consume is starting...");
        System.in.read();
    }

}
