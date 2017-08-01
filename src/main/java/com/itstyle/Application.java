package com.itstyle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alipay.demo.trade.config.Configs;
import com.itstyle.modules.weixinpay.util.ConfigUtil;
/**
 * 支付主控
 * 创建者 科帮网
 * 创建时间	2017年7月27日
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.itstyle.modules"})
@Controller
public class Application  {
	private static final Logger logger = Logger.getLogger(Application.class);
	
	@RequestMapping("/")
    public String   greeting() {
        return "index";
    }
	
	public static void main(String[] args) throws InterruptedException, IOException {
		SpringApplication.run(Application.class, args);
		//初始化 支付宝 微信参数 涉及机密 此文件不提交 请自行配置加载
		//依赖 commons.configuration 修改会自动更新相关配置
		Configs.init("zfbinfo.properties");
		ConfigUtil.init("wxinfo.properties");
		logger.info("支付项目启动 ");
	}
}