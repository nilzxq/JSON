# JSON
1、什么是JSON<br/>
2、介绍JSON应用场景<br/>
3、如何封装JSON及常用框架介绍<br/>
4、通过Map转JSON<br/>
5、通过JavaBean转JSON<br/>
6、Java如何解析JSON<br/>
7、GSON框架使用<br/>
8、经典面试题JSON与XML区别？<br/>
<h2>1、什么是JSON?</h2>
JSON(JavaScript Object Notation) 是一种轻量级的数据交换格式。它基于ECMAScript的一个子集。 JSON采用完全独立于语言的文本格式，但是也使用了类似于C语言家族的习惯（包括C、C++、C#、Java、JavaScript、Perl、Python等）。这些特性使JSON成为理想的数据交换语言。 易于人阅读和编写，同时也易于机器解析和生成(一般用于提升网络传输速率)。 
1.1JSON 语法<br/>
1.1.1 JSON 语法规则<br/>
JSON 语法是 JavaScript 对象表示语法的子集。<br/>
数据在键值对中<br/>
数据由逗号分隔<br/>
花括号保存对象<br/>
方括号保存数组<br/>
1.1.2JSON 名称/值对<br/>
JSON 数据的书写格式是：名称/值对<br/>
名称/值对组合中的名称写在前面（在双引号中），值对写在后面(同样在双引号中)，中间用冒号隔开：<br/>
	" userName ":"张三"<br/>
这很容易理解，等价于这条Java语句：<br/>
	userName ="张三"<br/>
  1.1.3JSON 值<br/>
JSON 值可以是：<br/>
数字（整数或浮点数）<br/>
字符串（在双引号中）<br/>
逻辑值（true 或 false）<br/>
数组（在方括号中）<br/>
对象（在花括号中）<br/>
null<br/>
<a href="http://www.sojson.com/">在线JSON格式化工具</a><br/>

<h2>2、JSON应用场景</h2><br/>
在RPC远程调用时,或者提供给外部访问接口，一般数据交互格式通常为JSON <br/>
例如提供移动APP接口、前端ajax异步访问数据、项目合作时提供外部访问接口等。<br/>
演示一些网站采用JSON传输<br/>
<a href="https://www.chexiangfu.com.cn/pay/recover/account.htm">某网站注册用户是否存在</a><br/>
<h2>3、如何封装json</h2>
封装json、比较流行的框架fastjson、gson、Jackson<br>
步骤使用框架fastjson<br>
新建一个mavenJava工程<br>
添加依赖<br>
<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>fastjson</artifactId>
			<version>1.1.26</version>
</dependency>
	<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.2.4</version>
		</dependency>
    
<h2>JSON与XML面试题解析</h2>
<h2>什么是JSON 、XML？</h2>
XML:记语言 (Extensible Markup Language, XML) ，用于标记电子文件使其具有结构性的标记语言，可以用来标记数据、定义数据类型，是一种允许用户对自己的<br/>标记语言进行定义的源语言。 XML使用DTD(document type definition)文档类型定义来组织数据;格式统一，跨平台和语言，早已成为业界公认的标准。<br/>
XML是标准通用标记语言 (SGML) 的子集，非常适合 Web 传输。XML 提供统一的方法来描述和交换独立于应用程序或供应商的结构化数据。<br/>
JSON(JavaScript Object Notation)一种轻量级的数据交换格式，具有良好的可读和便于快速编写的特性。可在不同平台之间进行数据交换。JSON采用兼容性很高的、<br/>完全独立于语言文本格式，同时也具备类似于C语言的习惯(包括C, C++, C#, Java, JavaScript, Perl, Python等)体系的行为。这些特性使JSON成为理想的数据交换语言。<br/>
JSON基于JavaScript Programming Language , Standard ECMA-262 3rd Edition - December 1999 的一个子集。<br/>
<strong>一句话总结:JSON和XML都是数据交换格式，JSON轻量级的数据交换格式、XML标记电子文件使其具有结构性的标记语言。</strong>

<h2>JSON与XML区别是什么？ 有什么共同点？</h2>
  详细参考地址: http://www.cnblogs.com/SanMaoSpace/p/3139186.html<br/>
  <strong>一句话总结:JSON轻量级的数据交换格式、XML标记电子文件使其具有结构性的标记语言。</strong>
1).XML的优缺点<br/>
<1>.XML的优点<br/>
　　A.格式统一，符合标准；<br/>
　　B.容易与其他系统进行远程交互，数据共享比较方便。<br/>
<2>.XML的缺点<br/>
　　A.XML文件庞大，文件格式复杂，传输占带宽；<br/>
　　B.服务器端和客户端都需要花费大量代码来解析XML，导致服务器端和客户端代码变得异常复杂且不易维护；<br/>
　　C.客户端不同浏览器之间解析XML的方式不一致，需要重复编写很多代码；<br/>
　　D.服务器端和客户端解析XML花费较多的资源和时间。<br/>
(2).JSON的优缺点<br/>
<1>.JSON的优点：<br/>
　　A.数据格式比较简单，易于读写，格式都是压缩的，占用带宽小；<br/>
　　B.易于解析，客户端JavaScript可以简单的通过eval()进行JSON数据的读取；<br/>
　　C.支持多种语言，包括ActionScript, C, C#, ColdFusion, Java, JavaScript, Perl, PHP, Python, Ruby等服务器端语言，便于服务器端的解析；<br/>
　　D.在PHP世界，已经有PHP-JSON和JSON-PHP出现了，偏于PHP序列化后的程序直接调用，PHP服务器端的对象、数组等能直接生成JSON格式，便于客户端的访问提取；<br/>
　　E.因为JSON格式能直接为服务器端代码使用，大大简化了服务器端和客户端的代码开发量，且完成任务不变，并且易于维护。<br/>
<2>.JSON的缺点<br/>
　　A.没有XML格式这么推广的深入人心和喜用广泛，没有XML那么通用性；<br/>
　　B.JSON格式目前在Web Service中推广还属于初级阶段。<br/>
一句话总结:XML它是用于RPC远程调用数据交换格式,因为XML文件格式复杂，比较占宽带，不易于维护，服务器端与客户端解析xml话费较多的资源和时间.<br/>
              JSON它是用于RPC远程调用数据交换格式,因为JSON文件格式压缩，占宽带小，易于维护。<br/>
           <h2>   为什么用JSON不用XML？</h2>
json是轻量级，xml是重量级。因为xml是重量级的，文件格式复杂，所以在远程调用时，比较占宽带。 json因为是轻量级，文件格式都是压缩的，占宽带小。<br/>

<h2>JSON、XML解析有那些方式？</h2>
JSON解析方式(阿里巴巴fastjson、谷歌gson,jackJson)<br/>
XML解析方式(dom、sax、pul)<br/>
哪里说一下JSON、XML你是在哪里用的？<br/>
这个就更具大家实际开发经验来说。<br/>
例如:一般现在移动APP接口都采用JSON，因为json占宽带小。<br/>
例如：我们公司微信开发,微信接口都是JSON格式的， 微信事件推送是XML。<br/>
JSON和XML都是在远程调用或者是和某公司合作定义数据交换格式。<br/>
