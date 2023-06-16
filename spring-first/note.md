Issue#1:
Cannot recognize getBean() from ApplicationContext (TestUser.java)

Reason:
pom.xml under spring-first is not recognized as maven project.

Solution:
1. Check the import as import org.springframework.context.ApplicationContext;
2. Right click pom.xml -> Add as maven project (https://stackoverflow.com/questions/49617509/intellij-does-not-find-pom-xml-file)