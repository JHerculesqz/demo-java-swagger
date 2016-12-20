package com.huawei.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.huawei.client1.vo.ReqVo;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class SwaggerController {
	// #region Fields

	@Autowired
	private SwaggerService swaggerService;

	// #endregion

	// #region hello

	@ApiOperation(value = "say hello", notes = "notes....")
	@ApiImplicitParam(name = "oReqVo", value = "ReqVo数据结构", required = true, dataType = "ReqVo")
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	@ResponseBody
	public String hello(@RequestBody ReqVo oReqVo) {
		return this.swaggerService.hello(oReqVo);
	}

	// #endregion
}
