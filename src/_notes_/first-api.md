### API Request using Spring Boot 

We want to use a web browser to send a request to our Spring Boot application to a particular port (8080) where
web server (Tomcat) is listening. Then the application will process the request and respond. 

#### API Request Steps:
`Web Browe -> PORT (Tomcat) -> Spring Boot Appplication -> Response`

In order to accomplish this we will create a simple method on the main class. 
To expose this method as a REST endpoint. we will annotate it with `@Getmapping("/")` 
passing the endpoint. Also, the class must be annotated with `@RestController` 
to make sure that any method within the class that has any of REST annotation like 
GET, POST, PUT... will be exposed as REST endpoints. The `/` as the endpoint being passed 
to the greet method is going to the root path. It can be specialized to say `/greet` so that
when you go to `locahost:8080/greet` the greet() function will be invoked and "Hello" will be 
displayed on the client side.

