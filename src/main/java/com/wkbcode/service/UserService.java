package com.wkbcode.service;

import com.wkbcode.pojo.UUser;


public interface UserService  {


    public String getUser(UUser user);


    public UUser findByName(String userName);

    public UUser getUserByid(UUser user) ;
}
