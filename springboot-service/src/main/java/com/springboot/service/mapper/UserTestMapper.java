package com.springboot.service.mapper;

import java.util.List;
import java.util.Map;
import com.springboot.api.entity.UserTest;

public interface UserTestMapper {

    List<UserTest> qryUserTestInfo(Map<String,Object> param);
    
}