package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.issue.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-20 14:55:26
 */
public class AlipayInsSceneApplicationIssueConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3179594613648422723L;

	/** 
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

}
