package com.springboot.http;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/JdbeTest")
@Api(description = "", tags = {"JdbcTest模块"})
public class DBController {
	
	@Resource
    private JdbcTemplate  jdbcTemplate ;
	
    @PostMapping("/test")
	@SuppressWarnings("rawtypes")
	@ApiOperation("Jdbc测试")
	public List<Map<String, Object>> test(@RequestBody Map req, HttpServletRequest httpRequest) {
    	String sql = "select * from user_test";
    	List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        return list;
    }
	
}
