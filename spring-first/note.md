Issue #1:
Cannot recognize getBean() from ApplicationContext (TestUser.java)

Reason:
pom.xml under spring-first is not recognized as maven project.

Solution:
1. Check the import as import org.springframework.context.ApplicationContext;
2. Right click pom.xml -> Add as maven project (https://stackoverflow.com/questions/49617509/intellij-does-not-find-pom-xml-file)



Issue #2:
OpenSSL SSL_read: Connection was reset, errno 10054

Solution:
git config --global http.sslVerify "false"



Issue #3:
Failed to connect to github.com port 443 after 21106 ms: Timed out

Solution:
git config --global http.sslVerify "false"

in cmd:
ipconfig /flushdns