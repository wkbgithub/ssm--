package com.wkbcode.dao;

import com.wkbcode.pojo.URolePermission;

public interface URolePermissionMapper {
    int insert(URolePermission record);

    int insertSelective(URolePermission record);
}