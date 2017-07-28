package com.itstyle.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itstyle.common.model.Product;
import com.itstyle.modules.alipay.service.IAliPayService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AliPayTest {
	@Autowired
	private IAliPayService aliPayService;
	@Test
	public void hello() {
		Product product = new Product();
		aliPayService.aliPay(product);
	}
}
