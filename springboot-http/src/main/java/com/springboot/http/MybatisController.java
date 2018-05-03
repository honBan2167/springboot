package com.springboot.http;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.api.inf.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Mybatis")
@Api(description = "", tags = {"Mybatis模块"})
public class MybatisController {
	
	@Resource
    private TestService  testService ;
	
    @PostMapping("/test")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ApiOperation("Mybatis测试")
	public Map test(@RequestBody Map req, HttpServletRequest httpRequest) {
    	List<Map<String, Object>> user = testService.qryUserTestInfo(req);
    	Map resp = new HashMap();
    	resp.put("user", user);
        return resp;
    }
	
}
