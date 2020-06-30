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
	public static String app_id = "2021001170652022";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCB261EeVcXdYcje9Z7smNScgv1KdGyKDDhzQzupqVYfOOSP3eNVEMHbRsPHVEYy2SaiaQXgMBjAY8HgQd+TzoS/kisaSpz1hgQZ88GWKMaaf5H0ahdMaAZWFz+SMgzcRNlJZRBDEO+hLS0S5bVzW/g95Q+CmJnfaMuMB9lrAQenCjA2W1sbhwLRpimiN9o0Ps0j6n6BpH9UmkIRpgQXdNEoo8y46TcMHuBU7bGg/bPJzlX0bS9zx8MFMHrl1h9pC9AKcA7PynYMftS/cDR6LeVS1niTwTdxmjrI8A1l5kxm7Z4jqcK0owdltcGkfdPXOjaHoBoWtqlMG5MNed/sCtTAgMBAAECggEAKZi1wuZfeHtEQ6CKjusQl7tCi1DPBBONvPbS+qtU8ahnuVQtNo9UPU+8yDWq4ZddbYdDkefDOLOqHkw9mz9DqgvcOaYiXCKraK3oCe9gp7hmJJlLJjccQqIkf6vOvXOuM8s61y9Xj/Kwc8R215vMB7MmwEzRQrdjCwuNMyNL2oXTVsbib7NcLict6y1NaI1W8w8yNrAYmCg+L/WlgKugJneuCuQqVYnU9oYYkykzQoXbn/YSF3eOEgaxjFquCM2HGFUFEqfmAol1So3siuhkkblFtaieHuJIjb4XE6a6a+FDVDg0qqzr1+KM+kxdxOmB42Vv8DWCYBul3VOWkcKEeQKBgQDPsZjn1rXUlCXpE4c0JEEC2JfenqOnXu92sLVOeeuYmdfPKt68O0U6m7FCttAQ6Qb22dZ/XGFdmA59yZOpKQ8Qm3o1vIQQD1tGPVT6GI0KTx7qhGzYvTDPAwSPbHN6kVM3ir98lsLfBdv8/KZKu2kMF+LT0fupylzMRA+l9lJsRwKBgQCgD6CZmeSSOUwGPItmMyCUP9h2mBlngxjcUPXKCoZEWTZr9IeehqZfZCb4YZRh2P219uTUtTjDiykP9stOBjapethHLEWPxgpadGJEKL5sJEMya1R/tvmHtk+9Pt6cH/ngBBgmy+QvIB1r/z8F4yo6YJyg/qRTpoYmLzP547CqlQKBgQCy+A2TkYAD21lDm9FAzBC9PBi5+6d3/SWJ+EFziznJuJ+vY/ik6MoB89FudIucVsDqi9H604cPGI08NSwpczkJDYDktzpxgFodj5IfJHK8tGsmmNAWgAiECcyvLjvgHURBMy1IVb08YxcqzCcbdJzTj+2kq2gZ6kfGuMtnLnfd1wKBgCmpx7ETyNZzCaH58oMovcs5DzxXfQ1fp4H5pPDxal+yJSNWpFKUVAwygp5WsAwEMo5B9PCVN3BW8dpQ8DygC2x0KIXmNTkmYJ2I++cn/+EgU0l1fKo905gK0Zi+G63h+OXhyvOWURAfOOlaqGn85ooJiduyTM3lY7few5XBOcQ9AoGAZ69tMx+8TQQH/GDbrOwp3/o/5QrWOk9UOrOf7UTbyp/KhEa7io2Ce+4nfqi6RQ2BW/emBf+vBCEwt7NaiWxCEApnu4g8K6UsjW17817Uo4nbaJRJ7TsXhhYmD8swDta83VnP8cpkCOkmaVM+0uBYE5z1ZBgSdxNLx97h3kMznaM=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgdutRHlXF3WHI3vWe7JjUnIL9SnRsigw4c0M7qalWHzjkj93jVRDB20bDx1RGMtkmomkF4DAYwGPB4EHfk86Ev5IrGkqc9YYEGfPBlijGmn+R9GoXTGgGVhc/kjIM3ETZSWUQQxDvoS0tEuW1c1v4PeUPgpiZ32jLjAfZawEHpwowNltbG4cC0aYpojfaND7NI+p+gaR/VJpCEaYEF3TRKKPMuOk3DB7gVO2xoP2zyc5V9G0vc8fDBTB65dYfaQvQCnAOz8p2DH7Uv3A0ei3lUtZ4k8E3cZo6yPANZeZMZu2eI6nCtKMHZbXBpH3T1zo2h6AaFrapTBuTDXnf7ArUwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
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

