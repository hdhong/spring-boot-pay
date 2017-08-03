package com.itstyle.modules.weixinpay.util;
import java.util.SortedMap;
import java.util.TreeMap;
import com.alipay.demo.trade.utils.ZxingUtils;
/**
 * 二维码生成器(扫码支付模式一)
 * 创建者 科帮网
 * 创建时间	2017年8月2日
 */
public class qrCodeUtil {
    public static void main(String[] args) {
		SortedMap<Object, Object> packageParams = new TreeMap<Object, Object>();
		ConfigUtil.commonParams(packageParams);
		packageParams.put("product_id", "20170731");//真实商品ID
		packageParams.put("time_stamp", PayCommonUtil.getCurrTime());
		String sign = PayCommonUtil.createSign("UTF-8", packageParams, ConfigUtil.API_KEY);
    	StringBuffer qrCode = new StringBuffer();
    	qrCode.append("weixin：//pay.52itstyle.com//bizpayurl?");//生产回调地址
    	qrCode.append("appid"+ConfigUtil.APP_ID);
    	qrCode.append("&mch_id="+ConfigUtil.MCH_ID);
    	qrCode.append("&nonce_str="+packageParams.get("nonce_str"));
    	qrCode.append("&product_id=1");
    	qrCode.append("&time_stamp="+packageParams.get("time_stamp"));
    	qrCode.append("&sign="+sign);
        ZxingUtils.getQRCodeImge(qrCode.toString(), 256, "D:\\weixn.png");
	}
}
