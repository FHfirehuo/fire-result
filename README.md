## FIRE RESULT

Other languages

[ENGLISH](./README_EN.md)


    支持 jdk1.6+
    本项目使用lombok进行开发
    


###### 结构树
```
  io
    └─github
        └─firehuo
            └─http
                └─response
                        DefaultResult.java
                        FailResult.java
                        Page.java
                        Result.java
                        ResultList.java
                        ResultObject.java
                        ResultPage.java
                        SuccessResult.java
                       
```

###### 如何使用

pom.xml中引入maven依赖

```xml
    <dependency>
	    <groupId>io.github.FHfirehuo</groupId>
	    <artifactId>fire-result</artifactId>
        <version>{latest.version}</version>
    </dependency>
```

###### 版本说明
2019.12.12

1.0.3
解决ListResult 和 PageResult 反序列化时data数量翻倍的bug

###### 关于发布

    说明：通过占位符${project.release.version}来控制需要发布的版本。
    用命令mvn deploy -P releases,发布fire-result的0.0.1版本到releases库。
    如果使用命令mvn deploy,则默认使用 0.0.1-SNAPSHOT版本号，将发布fire-result的 0.0.1-SNAPSHOT版本到snapshots库。
    
在 https://oss.sonatype.org系统中，使用自己的 Sonatype 账号登录后，
可在 Staging Repositories 中查看刚才已上传的构件，这些构件目前是放在Staging 仓库中，
可进行模糊查询，快速定位到自己的构件。此时，该构件的状态为 Open，需要勾选它，
然后点击 Close 按钮。系统会自动验证该构件是否满足指定要求，当验证完毕后，状态会变为Closed。

发现release版本才会出现在Staging Repositories里，snapshot版本不会出现在这里。

最后，点击 Release 按钮来发布该构件。

在Staging Profiles可以看到正在release。

这个前面的Sonatype工作人员其实在审核你的Issue时，在comment中已经提示你了，在Issue下面回复一条“构件已成功发布”的评论，
这是为了通知 Sonatype 的工作人员为需要发布的构件做审批，发布后会关闭该Issue。


```
gpg --keyserver hkp://pool.sks-keyservers.net --send-keys ****1
gpg --keyserver hkp://pool.sks-keyservers.net:11371 --send-keys ***1
gpg --keyserver hkp://keyserver.ubuntu.com:11371 --send-keys ***1
gpg --keyserver hkp://keys.gnupg.net:11371 --send-keys ***1

```
```
    发布测试: mvn clean deploy
     发布正式:mvn clean deploy –P release
```

发布借鉴文章 https://blog.csdn.net/xiajiqiu/article/details/77607492
    