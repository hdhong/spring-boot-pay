package com.itstyle;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/**
 * 支付主控
 * 创建者 科帮网
 * 创建时间	2017年7月27日
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.itstyle.modules"})
public class Application  {
	private static final Logger logger = Logger.getLogger(Application.class);
	
	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Application.class, args);
		logger.info("支付项目启动 ");
	}
}