package com.itstyle.modules.alipay.service;

import com.itstyle.common.model.Product;
/**
 * 扫码支付以及手机H5支付
 * 创建者 科帮网
 * 创建时间	2017年7月27日
 */
public interface IAliPayService {
	/**
	 * 阿里支付预下单
	 * 如果你调用的是当面付预下单接口(alipay.trade.precreate)，调用成功后订单实际上是没有生成，因为创建一笔订单要买家、卖家、金额三要素。
     * 预下单并没有创建订单，所以根据商户订单号操作订单，比如查询或者关闭，会报错订单不存在。
     * 当用户扫码后订单才会创建，用户扫码之前二维码有效期2小时，扫码之后有效期根据timeout_express时间指定。
	 * @Author  科帮网
	 * @param product
	 * @return  String
	 * @Date	2017年7月27日
	 * 更新日志
	 * 2017年7月27日  科帮网 首次创建
	 *
	 */
	String aliPay(Product product);
    /**
     * 阿里支付退款
     * @Author  科帮网
     * @param product
     * @return  String
     * @Date	2017年7月27日
     * 更新日志
     * 2017年7月27日  科帮网 首次创建
     *
     */
	String aliRefund(Product product);
	/**
	 * 关闭订单
	 * @Author  科帮网
	 * @param product
	 * @return  String
	 * @Date	2017年7月27日
	 * 更新日志
	 * 2017年7月27日  科帮网 首次创建
	 *
	 */
	String aliCloseorder(Product product);
	/**
     * 下载对账单 
	 * @Author	科帮网 
	 * @param billDate(账单时间：日账单格式为yyyy-MM-dd，月账单格式为yyyy-MM。)
	 * @param billType(trade、signcustomer；trade指商户基于支付宝交易收单的业务账单；signcustomer是指基于商户支付宝余额收入及支出等资金变动的帐务账单；)
	 * @return  String
	 * @Date	2017年7月27日
	 * 更新日志
	 * 2017年7月27日  科帮网 首次创建
	 *
	 */
	String downloadBillUrl(String billDate,String billType);
	/**
	 * 手机支付返回一个form表单 然后调用方刷新到H5页面
	 * @Author  科帮网
	 * @param product
	 * @return  String
	 * @Date	2017年7月27日
	 * 更新日志
	 * 2017年7月27日  科帮网 首次创建
	 * 备注：人民币单位为分
	 * attach 附件参数 使用json格式传递 用于回调区分
	 */
	String aliPayMobile(Product product);
}
