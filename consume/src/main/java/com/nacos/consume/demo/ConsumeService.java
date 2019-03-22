package com.nacos.consume.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.nacos.api.annotation.NacosInjected;
import com.nacos.provider.demo.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sound.midi.Soundbank;

/**
 * @author yebin
 * @version 1.0
 * @className ConsumeService
 * @description ceshi
 * @date 2019/3/21 17:29
 **/
@Component
public class ConsumeService {

    @Reference(version = "1.0",group = "providerDemo",registry = "dubboRegistry")
    ProviderService providerService;

    @PostConstruct
    public void initData(){
        for(int i = 0; i < 10; i++){
            System.out.println(providerService.sayHello("叶宾"));
        }
    }
}
