package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102700770141";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCRju1Pybrduk7k/OWvNJtJk0vOVHx6j8D3MzApPbkkQjpD54sPyJsVriqbHZnIabwhILn1P27jaVqvCn1v+u85iXDoMwcNBxwPg72nLvzGapdZ8GOmDFOhxRT69fT74xaRnC7RkMT9NvyEed2sHfi5I3IP6LMKJlgD8D8M11GxYNf8AjzNU6DUb8Nyc5z66YaasFvpfnXg4gQw0MVLfssPboIIm0reKvUKVutLbRWy7EVGLidpZoWhrDhh1Pt/H6BLdqJQJHj/Jn5rdI/OieS8H5sl1x2Gz3xSLXBgAExfXdC+CLdsYAFAIyWaGoM6G7g9rt+wDytGJp/IiNvQ7vl5AgMBAAECggEAYFPREwtyoggI7Bu9OOy8k71p3nslAcserblvduuFGczGWGfkLKbak0d2pL67JdlrihTpW7cGAHOZctujVbcgF9iwIsqaMPHyjQXnPbunxvuFfBzNJXdk5VrS3p5k6UlIh0Zv6XpAEz8Pb/BiVeRj1MnzUznxOpdTig+0+h+IzbRC7pwrAjomQ6Qm+OZy+6wy0O3NJSOvaZwlZmd9HMZznpnppu7jdGkzjljc69PmWCqAO5B0NUVBR/3VW7/HoPX+Q05iUqH+ok5FRdtyY5Y+Q91NRRBJ2zkT8wLNJRuyyNwNxJz/7RD0w7RGzvlvCrzR4mBtpa4ENSE8p3icLDkDzQKBgQDaPfvT+eU/WR2hrJg9TarIQ3WiYZHgxpb+98QAf+umeQKBsQ2LzuB2fE7WL6ee7q5ReSm/fod73b1mLIZVqW5vtypZ9GinUByhYgDUh6JMhma7zsxbC2MuDyLcUsEfkMpx2UVt+8c2l9FmSsu4sNtSyc9FMH8MOLFvyt9Wq03Q6wKBgQCqvcC/6/kcmBrr8PL0hVrBEqfbVFGtoct70199dhEi/NiMRmLHf6X17MtzI1tw7DKFy19Lf43VVlzrZx+/7PNSHCdGmWnfSxRHLRBaxReAKYSp2U1n7w3812dXkZhN6T6Qm2CucCwsdwbbxT1RyVMdlPYcHi87PgoEE9kt8w4mKwKBgQCrRmPha0gf3CdmH5bm3ZI/Urn6MwqSVihgd0AqiDn/Tw7Ji5Mu+q+sLUiNzZ6GG5lQtX8vGvTnIBGpIx5WEf9qy1wAdtC/Jh8iBFDUepHD7uKnV9eHSDuRBS39rTCFPlOy36oec69XR/R9jAuvqZSmt1zkVvgONlwCeTunwA70+wKBgCXWv6zI4wBPRUgcsfs2wpIfTEvzN9a/EJV0lqj7TXjviB4uSx3jUChcPgpaP52a+udj1s6oigpJhXY1+HdUT+hWjO28ehYeUXQkrIcxPrAMg3YQznLGK9do9WIWxiYeFtt9U8PU4DVKe56g66IAeAcKSDCbD+SVLysQKwVf5DbZAoGADpaDBHTAFWUP1yYCU5I5soSg4Rcm2Oj2Ei3VGDaThh/14gcsh1PbOFYiBr/AHr0pKSwylKBSdk/ov3Chh62VHDj2iH+mUacFjaulNN1lnFWMBXwo5Tg9zla5HYAgxq5shW5WSBCO6H9arpbjUMatz8PgmLoM1jgOSkJPSP3vgrE=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAthdKCaj2yfoHwZxJTgeLF7jo46XrDEu6L2pfpvPkW8/rhGSbTFzB9TkLpdYrZosGBoUrToDLSZPoOmiTJ4yRICmPaMgXyOXAvaNErOvYdXKjAZV8syxvNqVICx0+Laj73Z2uhiPZvb+KLHzWHFi1rS76j4qzVHFbxv8inPr+mRLJ/azygbrbL7VolCmvr+IpFsBG+KsBhjR5Z9++Uhez2uDBIZ2mENk8FiTGV8f9kJWqHufEChZo0+GXDCAfYg/vC2IzFO1hy5GOL8I262T1KIlEuZrovrNrZKM+tEoILgLAPL5atk8uBJOS4gnAkGmlN1CdpTxAfzv1YEicA0tukwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://w94ii.iok.la/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://w94ii.iok.la/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

