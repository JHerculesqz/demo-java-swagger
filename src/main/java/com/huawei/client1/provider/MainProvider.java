package com.huawei.client1.provider;

import com.huawei.client1.vo.ReqVo;

public class MainProvider {
	// #region hello

	public static String hello(ReqVo oReqVo) {
		System.out.println(oReqVo.getName() + "," + oReqVo.getAge());
		return "hello," + oReqVo.getName() + "," + oReqVo.getAge();
	}

	// #endregion
}
