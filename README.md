#spring-boot-pay
支付服务：支付宝，微信，银联详细代码案例(企业认证)

##支付宝

- 电脑支付：https://docs.open.alipay.com/270
- 扫码支付：https://docs.open.alipay.com/194
- 手机支付：https://docs.open.alipay.com/203
- 参数zfbinfo.properties

```
支付宝网关名、partnerId和appId
open_api_domain = https://openapi.alipay.com/gateway.do
mcloud_api_domain = http://mcloudmonitor.com/gateway.do
此处请填写你的PID
pid =XXXXXXXXXXXXXX
此处请填写你当面付的APPID 
appid =XXXXXXXXXXXXXX

RSA私钥、公钥和支付宝公钥
private_key = XXXXXXXXXXXXXX
public_key = XXXXXXXXXXXXXX
alipay_public_key = XXXXXXXXXXXXXX

当面付最大查询次数和查询间隔（毫秒）
max_query_retry = 5
query_duration = 5000

当面付最大撤销次数和撤销间隔（毫秒）
max_cancel_retry = 3
cancel_duration = 2000

交易保障线程第一次调度延迟和调度间隔（秒）
heartbeat_delay = 5
heartbeat_duration = 900

```

##微信

- 扫码支付：https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=6_1
- 公众号支付：https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=7_1
- H5支付：https://pay.weixin.qq.com/wiki/doc/api/H5.php?chapter=15_1
- 微信退款说明：https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_3
- 参数wxinfo.properties

```
服务号的应用ID
APP_ID = XXXXXXXXXXXXXX
服务号的应用密钥
APP_SECRET = XXXXXXXXXXXXXX
服务号的配置token
TOKEN = XXXXXXXXXXXXXX
商户号
MCH_ID = XXXXXXXXXXXXXX
API密钥
API_KEY = XXXXXXXXXXXXXX
签名加密方式
SIGN_TYPE = MD5
微信支付证书名称
CERT_PATH = apiclient_cert.p12
```

##银联
- 开放平台：https://open.unionpay.com/ajweb/index
- 商家中心：https://merchant.unionpay.com/join/

#注意
由于工作原因，项目正在完善中 ，随时更新日志，有疑问请留言或者加群

- JAVA爱好者①:26490602
- JAVA爱好者②:361526039
- JAVA爱好者③:571607950

##2017年07月30日更新

- 项目中的支付宝SDk需要自行去官网下载打入本地仓库或者私服，提供下载地址：http://pan.baidu.com/s/1mi5LfhI
- 支付相关参数zfbinfo.properties，需要自行去阅读支付宝文档自行生成
- 支付宝生成支付二维码Demo已经测试完成
- 支付宝手机端H5支付Demo已经测试完成
- 支付宝电脑支付Demo已经测试完成
- 支付宝页面演示

##2017年07月31日更新
- 微信支付基础组间
- 微信退款证书，微信商户平台(pay.weixin.qq.com)-->账户中心-->账户设置-->API安全-->证书下载，使用apiclient_cert.p12即可
- 支付相关参数wxinfo.properties，需要自行去阅读微信支付文档自行生成
- 微信二维码支付Demo测试完成
- 微信公众号支付(需要添加认证网址)
