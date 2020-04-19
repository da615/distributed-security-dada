使用OAuth2.0 jwt模式，进行验证授权

master分支：基于jwt认证模式 
implement_distribution:是在master基础上新建分支，功能的强化，基于分布式认证模式



//访问的url
访问方式一：code模式
第一步：先拿code，get请求
http://localhost:53010/uaa/oauth/authorize?client_id=c1&response_type=code&scope=ROLE_ADMIN&redirect_uri=http%3A%2F%2Fwww.baidu.com

第二步：拿上code获取token，post请求，
localhost:53010/uaa/oauth/token
其中body:k-v
client_id :c1
client_secret :secret
grant_type:authorization_code
code:获取的code
redirect_uri：http:www.baidu.com

还有其他模式等.....

ps:
    token校验路径：http://localhost:53020/uaa/oauth/check_token，post请求，
    body有：
        token ： 获取的token值
    拿到token去order服务访问资源http://localhost:53021/order/r1，get请求， header有Authorization：Bearer 获取的token




说明：
什么是认证、授权、会话。
Java Servlet为支持http会话做了哪些事儿。
基于session认证机制的运作流程。
基于token认证机制的运作流程。
理解Spring Security的工作原理，Spring Security结构总览，认证流程和授权，中间涉及到哪些组件，这些组件分
别处理什么，如何自定义这些组件满足个性需求。
OAuth2.0认证的四种模式？它们的大体流程是什么？
Spring cloud Security OAuth2包括哪些组件？职责？
分布式系统认证需要解决的问题？




