package com.pdk.api.service;

import com.pdk.api.pojo.User;

import java.rmi.RemoteException;

public interface UserService {
    User selectUserById(Integer id) throws RemoteException;
}
