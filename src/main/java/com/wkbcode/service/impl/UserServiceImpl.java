package com.wkbcode.service.impl;

import com.wkbcode.dao.UUserMapper;
import com.wkbcode.pojo.UUser;
import com.wkbcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UUserMapper uUserMapper;

    public String getUser (UUser user){

//        criteria.andOperator(Criteria.where("user").is(user.getUser()));
//        Query query = new Query(criteria);
//        UUser result = findOne(query, User.class);
//        if (null != result) {
//            return result.getName();
//        }
        return "0";
    }

    public UUser findByName(String userName) {
    	return uUserMapper.selectByPrimaryKey(1L);
         
    }

    public UUser getUserByid(UUser user) {
        UUser user1 =  uUserMapper.selectByPrimaryKey(user.getId());
        return user1;

    }
}
