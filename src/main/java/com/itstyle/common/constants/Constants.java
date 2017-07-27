package com.itstyle.common.constants;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.context.ContextLoader;

public class Constants {
	
	/**系统启动初始化**/
	public static Map<String, String> PAY_URL = new ConcurrentHashMap<String, String>();
	
	public static final String SF_FILE_SEPARATOR = System.getProperty("file.separator");//文件分隔符
	public static final String SF_LINE_SEPARATOR = System.getProperty("line.separator");//行分隔符
	public static final String SF_PATH_SEPARATOR = System.getProperty("path.separator");//路径分隔符
	
	
	public static final String PATH = ContextLoader.getCurrentWebApplicationContext().getServletContext().getRealPath("/file")
	         +Constants.SF_FILE_SEPARATOR;

	public static final String QRCODE_PATH = PATH+"pay_qrCode"; 
	
	public static final String WEIXIN_BILL = "tradetime, ghid, mchid, submch, deviceid, wxorder, bzorder, openid, tradetype, tradestatus, bank, currency, totalmoney, redpacketmoney, wxrefund, bzrefund, refundmoney, redpacketrefund, refundtype, refundstatus, productname, bzdatapacket, fee, rate";
	
	public static final String PATH_BASE_INFO_XML = SF_FILE_SEPARATOR+"WEB-INF"+SF_FILE_SEPARATOR+"xmlConfig"+SF_FILE_SEPARATOR;
	
	public static final String CURRENT_USER = "UserInfo";
	
	public static final String SUCCESS = "success";
	
	public static final String FAIL = "fail";
	
}
