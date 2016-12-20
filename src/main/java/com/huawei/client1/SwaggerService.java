package com.huawei.client1;

import org.springframework.stereotype.Service;

import com.huawei.client1.provider.MainProvider;
import com.huawei.client1.vo.ReqVo;

@Service
public class SwaggerService {
	// #region hello

	public String hello(ReqVo oReqVo) {
		return MainProvider.hello(oReqVo);
	}

	// #endregion
}
