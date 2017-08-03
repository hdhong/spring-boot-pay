##spring-boot-pay
支付服务：支付宝，微信，银联详细代码案例(除银联支付可以测试以外，支付宝和微信支付测试均需要企业认证，个人无法完成测试)，项目启动前请仔细阅读 **注意事项** :facepunch:   。

##友情提示
由于工作原因，项目正在完善中（仅供参考），随时更新日志，有疑问请留言或者加群

- JAVA爱好者①:<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=f316b04ba30f31190c0d8120b5c54acf245299726b4450fb6fc64753dd546bf8"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="JAVA爱好者①" title="JAVA爱好者①"></a> (满)
- JAVA爱好者②:<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=b2fc105d5cf11231cd863dc829b82f50454b693ad20b892a362de5adbcc9b0b3"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="JAVA爱好者②" title="JAVA爱好者②"></a>
- JAVA爱好者③:<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=cbee3cb06364401522ea90776a1bd83cdbbed20622b93a37158d41460537db96"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="JAVA爱好者③" title="JAVA爱好者③"></a>

## 演示界面
![模拟登陆](https://git.oschina.net/uploads/images/2017/0802/191105_d59172ca_87650.png "0.png")

![模拟首页](https://git.oschina.net/uploads/images/2017/0802/191116_04d62422_87650.png "1.png")

![模拟支付](https://git.oschina.net/uploads/images/2017/0802/191125_6958b9b3_87650.png "2.png")

##欢迎关注

![输入图片说明](https://git.oschina.net/uploads/images/2017/0802/192116_4752d44b_87650.jpeg "1801066129 (1).jpg")

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

- H5支付：https://pay.weixin.qq.com/wiki/doc/api/H5.php?chapter=15_1
- 公众号支付：https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=7_1
- 扫码支付模式一：https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=6_4
- 扫码支付模式二：https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=6_5
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
- 测试账号：https://blog.52itstyle.com/archives/326/

##注意事项
- 除银联支付可以测试以外，支付宝和微信支付测试均需要企业认证，个人无法完成测试
- 项目中的支付宝SDk需要自行去官网下载打入本地仓库或者私服，提供下载地址：http://pan.baidu.com/s/1mi5LfhI
- 微信退款证书，微信商户平台(pay.weixin.qq.com)-->账户中心-->账户设置-->API安全-->证书下载，使用apiclient_cert.p12即可
- 支付宝支付相关参数zfbinfo.properties，需要自行去阅读支付宝文档自行生成
- 微信支付相关参数wxinfo.properties，需要自行去阅读微信支付文档自行生成
- 公众平台微信支付公众号支付授权目录、扫码支付回调URL配置入口已于8月1日迁移至商户平台（pay.weixin.qq.com）。迁移后，原有配置数据不会受影响，你可在商户平台查看和配置。带来的不便敬请谅解。

## 更新日志
- 支付宝生成支付二维码Demo已经测试完成
- 支付宝手机端H5支付Demo已经测试完成
- 支付宝电脑支付Demo已经测试完成

- 微信二维码支付模式二Demo测试完成
- 微信公众号支付(需要添加认证网址)
- 微信H5支付(审核中)

- 银联支付电脑支付Demo测试完成
- 银联支付H5支付Demo测试完成

- 微信二维码支付模式一Demo测试完成


作者： 小柒2012

欢迎关注： https://blog.52itstyle.com