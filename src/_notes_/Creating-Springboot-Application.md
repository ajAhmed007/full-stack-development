## Spring Boot Application

### Steps to creating a spring boot application:

- (1) The class must be annotated with `@SrpingBootApplication`
- (2) To run the application use `SpringApplication.run(Main.class, args)` passing the main class args

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
```
Running the SpringBoot Application will start a web server running on PORT 8080 using 
Tomcat. 

### What is Tomcat?
Tomcat is pure java HTTP web server environment in which java code can be run. 
