### Issue #1:
Cannot recognize getBean() from ApplicationContext (TestUser.java)

#### Reason:
pom.xml under spring-first is not recognized as maven project.

#### Solution:
1. Check the import as import org.springframework.context.ApplicationContext;
2. Right click pom.xml -> Add as maven project (https://stackoverflow.com/questions/49617509/intellij-does-not-find-pom-xml-file)

&emsp;

### Issue #2:
OpenSSL SSL_read: Connection was reset, errno 10054

#### Solution:
```git config --global http.sslVerify "false"```

&emsp;

### Issue #3:
Failed to connect to github.com port 443 after 21106 ms: Timed out

#### Solution:
```
git config --global http.sslVerify "false"
git config --global http.proxy http://127.0.0.1
git config --global http.proxy https://127.0.0.1
git config --global --unset http.proxy
git config --global --unset https.proxy
```

in cmd:
```ipconfig /flushdns```

6.21.2023 Update:
```
git config --global http.proxy http://127.0.0.1:7890
git config --global https.proxy http://127.0.0.1:7890
``` 

&emsp;

### Issue #4:
packaging with value jar is invalid

#### Solution:
1. In parent pom.xml, add ```<packaging>pom</packaging>```

&emsp;

### Issue #5:
Failed to inherit parent module's dependency to child module

#### Solution:
1. Make sure the child module is a module and detected by maven
2. In parent pom.xml, add 
```     
    <modules>
        <module>spring-first</module>
    </modules>
```
3. In child pom.xml, add
```
    <parent>
        <groupId>org.example</groupId>
        <artifactId>Spring6</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
```
(https://stackoverflow.com/questions/69835342/maven-why-are-dependencies-declared-in-parent-pom-not-inherited-by-child-pom)