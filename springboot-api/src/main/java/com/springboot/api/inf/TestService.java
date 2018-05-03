package com.springboot.api.inf;

import java.util.List;
import java.util.Map;

import com.springboot.api.entity.UserTest;

public interface TestService {

	String test(Map<String,Object> param);
	
	List<UserTest> qryUserTestInfo(Map<String,Object> param);
	
}
