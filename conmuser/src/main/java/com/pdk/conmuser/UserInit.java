package com.pdk.conmuser;

import com.pdk.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInit implements CommandLineRunner {
    @DubboReference(version = "1.0.0")
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService.selectUserById(2));
    }
}
