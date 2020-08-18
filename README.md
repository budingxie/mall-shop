项目整体介绍
===
- 整体概览图<br>
https://www.processon.com/view/link/5f312c387d9c083149a972a8
- 数据库表之间的关系图<br>
https://www.processon.com/view/link/5f38a43b0791290e6cfbe318
- 微服务架构图<br>
https://www.processon.com/view/link/5f38aa2a63768956ffa504af
- 门户首页原型<br>
https://modao.cc/app/542d680ecffd841222ad1e520af6a90d616bb199?simulator_type=device&sticky

模块介绍
===

mall-model模块
---
<br>存放公共实体类，和数据库中实体一一对应
   
goods-view模块
---
<br> 商品展示模块，为门户首页提供必须需要的数据接口

spring-cloud-alibaba-nacos-register-demo模块
---
<br>服务注册demo

spring-cloud-alibaba-nacos-discovery-demo模块
---
<br>服务发现demo, 采用http协议实现远程调用

cloud-alibaba-dubbo-provider模块
---
<br>生成者demo

cloud-alibaba-dubbo-consumer模块
---
<br>消费者demo, 采用dubbo协议实现远程调用

cloud-gateway-demo
---
<br>网关服务, 统一对外暴露网关, 真正的服务存在内网, 通过网关去转发请求。
<br>使用方式: 启动被网关拦截的服务, 启动网关, 现在直接访问网关的地址, 加上对应服务的路径.
<br>例子: 启动spring-cloud-alibaba-nacos-register-demo服务(可以多个, 网关有负载均衡), 再启动cloud-gateway-demo
<br>浏览器上请求: http://127.0.0.1:80/nacosRegisterDemoService/helloNacos; 注意这是网关的地址和端口 

以及后续添加的
---