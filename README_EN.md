## FIRE RESULT

    Support jdk1.6+
    This project uses lombok for development
    
###### Tree

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

###### how to use

Introducing maven dependencies in pom.xml

```xml
    <dependency>
	    <groupId>io.github.FHfirehuo</groupId>
	    <artifactId>fire-result</artifactId>
        <version>{latest.version}</version>
    </dependency>
```