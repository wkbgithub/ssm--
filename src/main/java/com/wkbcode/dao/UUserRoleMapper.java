package com.wkbcode.dao;

import com.wkbcode.pojo.UUserRole;

public interface UUserRoleMapper {
    int insert(UUserRole record);

    int insertSelective(UUserRole record);
}