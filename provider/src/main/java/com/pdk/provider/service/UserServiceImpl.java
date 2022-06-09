package com.pdk.provider.service;

import com.pdk.api.pojo.User;
import com.pdk.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import java.rmi.RemoteException;

@DubboService(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public User selectUserById(Integer id) throws RemoteException {
        User user = new User();
        user.setId(id);
        user.setUserName("吕师傅");
        System.out.println("提供服务，接收到客户端的用户id为" + id);
        return user;
    }
}
