package com.springboot.http;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.api.inf.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
@Api(description = "", tags = {"Test模块"})
public class TestController {
	
	@Resource
    private TestService testService;
	
    @PostMapping("/test")
	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@RequestMapping("/test")
	@ApiOperation("demo")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
        @ApiImplicitParam(name = "testBean", value = "测试类实体", required = true, dataType = "TestBean")
    })
	public String test(@RequestBody Map req, HttpServletRequest httpRequest) {
    	return testService.test(req);
    }
	
}
