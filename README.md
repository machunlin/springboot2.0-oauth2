# springboot2.0-oauth2
[![GitHub stars](https://img.shields.io/github/stars/longfeizheng/springboot2.0-oauth2.svg?style=flat&label=Star)](https://github.com/longfeizheng/springboot2.0-oauth2/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/longfeizheng/springboot2.0-oauth2.svg?style=flat&label=Fork)](https://github.com/longfeizheng/springboot2.0-oauth2/fork)
[![GitHub watchers](https://img.shields.io/github/watchers/longfeizheng/springboot2.0-oauth2.svg?style=flat&label=Watch)](https://github.com/longfeizheng/springboot2.0-oauth2/watchers)
- [springboot 2.0 整合Oauth2](https://longfeizheng.github.io/2018/04/29/Spring-Boot-2.0-%E6%95%B4%E5%90%88-Spring-Security-Oauth2/)
- [SpringBott 1.5.6.RELEASE整合Oauth2](https://github.com/longfeizheng/security-oauth2)


#### 授权码模式

[![https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth202.gif](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth202.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth202.gif")](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth202.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth202.gif")

#### 密码模式

[![https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth203.gif](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth203.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth203.gif")](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth203.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth203.gif")

#### 自定义登录

[![https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth204.gif](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth204.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth204.gif")](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth204.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth204.gif")

#### 刷新token

[![https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth205.gif](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth205.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth205.gif")](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth205.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth205.gif")

#### 测试资源服务器

[![https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth206.gif](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth206.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth206.gif")](https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth206.gif "https://raw.githubusercontent.com/longfeizheng/longfeizheng.github.io/master/images/security/spring-security-oauth206.gif")


---

一、授权码方式：

1、向第三方网站申请授权码：
http://localhost:8888/oauth/authorize?response_type=code&client_id=merryyou&redirect_uri=http://www.merryyou.cn&scope=all


2、根据返回的code(即授权码authorization_code)，向第三方申请访问令牌：

http://127.0.0.1:8888/oauth/token?grant_type=authorization_code&client_id=merryyou&code=&redirect_uri=http://www.merryyou.cn&scope=all&client_secret=merryyou


3、第三方网站返回的令牌：
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsInNjb3BlIjpbImFsbCJdLCJleHAiOjE1NjExOTczOTksImJsb2ciOiJodHRwczovL2xvbmdmZWl6aGVuZy5naXRodWIuaW8vIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6ImQ5YmMyY2Y4LWVhNjQtNGZhZC1hZjA0LTgzNGUxMjI0NGRjZSIsImNsaWVudF9pZCI6Im1lcnJ5eW91In0.2pO96jM6GUV2RkxTjm4hXMLKXj8pxo2e65E4S3A_s6g",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsInNjb3BlIjpbImFsbCJdLCJhdGkiOiJkOWJjMmNmOC1lYTY0LTRmYWQtYWYwNC04MzRlMTIyNDRkY2UiLCJleHAiOjE1NjI0ODYxOTksImJsb2ciOiJodHRwczovL2xvbmdmZWl6aGVuZy5naXRodWIuaW8vIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6IjQ3ZjU1ZDI3LWUwNTgtNGM1NS1hMTdkLWUwZWYxMjlhMzgyYSIsImNsaWVudF9pZCI6Im1lcnJ5eW91In0.Ex0VD6Qvzc_5Jz_MsO496rktt5v4Io_rleDWbkrjd8c",
    "expires_in": 7194,
    "scope": "all",
    "blog": "https://longfeizheng.github.io/",
    "jti": "d9bc2cf8-ea64-4fad-af04-834e12244dce"
}


二、密码方式：
http://127.0.0.1:8888/oauth/token?grant_type=password&username=admin&password=123456&scope=all

返回令牌：
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsInNjb3BlIjpbImFsbCJdLCJleHAiOjE1NjExOTY3NTYsImJsb2ciOiJodHRwczovL2xvbmdmZWl6aGVuZy5naXRodWIuaW8vIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6ImUyNWRmYWFmLTc5MDgtNDZkNi1iOGZhLWU4MjI3ZmJjZmU0ZCIsImNsaWVudF9pZCI6Im1lcnJ5eW91In0.QPP9Jt5QijTlDiBnIFrIbQvFqCows4dHDmD38MahsVo",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsInNjb3BlIjpbImFsbCJdLCJhdGkiOiJlMjVkZmFhZi03OTA4LTQ2ZDYtYjhmYS1lODIyN2ZiY2ZlNGQiLCJleHAiOjE1NjI0ODU1NTYsImJsb2ciOiJodHRwczovL2xvbmdmZWl6aGVuZy5naXRodWIuaW8vIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6IjUyMDk0NDY4LTBiM2ItNDVhMy1hOTcyLTI2ZjY0YTM0M2RkMiIsImNsaWVudF9pZCI6Im1lcnJ5eW91In0.wJDuHvyHckaOVRim23ohzguOCufXa01e36R8KzXGP6s",
    "expires_in": 7199,
    "scope": "all",
    "blog": "https://longfeizheng.github.io/",
    "jti": "e25dfaaf-7908-46d6-b8fa-e8227fbcfe4d"
}


三、拿到令牌后，请求API接口：http://localhost:8889/api
    具体做法是在请求的头信息，加上一个Authorization字段，获取的令牌就放在header 里面： 
	  curl -H "Authorization: Bearer {ACCESS_TOKEN}"
	
四、拿到令牌后，请求API接口获取当前登录用户的JWT  : http://127.0.0.1:8888/userJwt ,, http://127.0.0.1:8888/user/me
    做法是在请求的头信息，加上一个Authorization字段，获取的令牌就放在header 里面： 
	  curl -H "Authorization: Bearer {ACCESS_TOKEN}"
	
	
	