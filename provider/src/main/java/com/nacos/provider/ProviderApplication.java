package com.nacos.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author yebin
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.nacos.provider.demo")
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("DemoService provider is starting...");
        //程序等待不关闭
        System.in.read();
    }

}
