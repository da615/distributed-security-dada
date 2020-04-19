
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