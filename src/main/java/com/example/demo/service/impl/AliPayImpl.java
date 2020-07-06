package com.example.demo.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.config.AlipayConfig;
import com.example.demo.service.AliPay;
import org.springframework.stereotype.Service;

@Service
public class AliPayImpl implements AliPay {
    @Override
    public String prePay() {
        AlipayClient alipayClient   =   new DefaultAlipayClient( AlipayConfig.gatewayUrl , AlipayConfig.app_id,  AlipayConfig.merchant_private_key ,  "json" ,  AlipayConfig.charset ,  AlipayConfig.alipay_public_key ,  AlipayConfig.sign_type );  //获得初始化的AlipayClient
        AlipayTradePrecreateRequest request   =   new   AlipayTradePrecreateRequest (); //创建API对应的request类
        request . setBizContent ( "{"   +
                "    \"out_trade_no\":\"20150320010101002\","   + //商户订单号
                "    \"total_amount\":\"88.88\","   +
                "    \"subject\":\"Iphone6 16G\","   +
                "    \"store_id\":\"NJ_001\","   +
                "    \"timeout_express\":\"90m\"}" ); //订单允许的最晚付款时间
        AlipayTradePrecreateResponse   response   = null;
        try {
            response = alipayClient . execute ( request );
        } catch (AlipayApiException e) {
            e.printStackTrace();
            return null;
        }
        System . out . print ( response . getBody ());
        String qrCode = response.getQrCode();
        //根据response中的结果继续业务逻辑处理
        return qrCode;
    }
}
