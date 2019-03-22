package com.nacos.provider.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nacos.provider.demo.ProviderService;

/**
 * @author yebin
 * @version 1.0
 * @className ProviderServiceImpl
 * @description 测试
 * @date 2019/3/21 14:50
 **/
@Service(registry  = "dubboRegistry",version = "1.0",group = "providerDemo",owner = "yebin",timeout = 5000)
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String name) {
        return "***** OH ， My God!~~~~" + name + ",天下无敌，唯我独尊~~~~!!! *****";
    }
}
