package com.springboot.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.springboot.api.entity.TestBean;
import com.springboot.api.entity.UserTest;
import com.springboot.api.inf.TestService;
import com.springboot.service.mapper.UserTestMapper;

@Service
public class TestServiceImpl implements TestService{

	@Resource
    private TestBean testBean;
	
	@Resource
    private UserTestMapper userTestMapper;
	
	@Value(value = "${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @Value("${book.pinyin}")
    private String bookPinYin;
	
	@Override
	public String test(Map<String, Object> param) {
        return "book.name="+testBean.getName()+":book.author="+testBean.getAuthor()+":book.pinyin="+testBean.getPrice()+":param="+param.toString();
	}

	@Override
	public List<UserTest> qryUserTestInfo(Map<String, Object> param) {
		return userTestMapper.qryUserTestInfo(param);
	}
	
}
