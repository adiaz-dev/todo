1. It needs to include AOP, with all its features
2. I need to use Autowire
3. Use @EnableGlobalMethodSecurity(jsr250Enabled = true) to check its impact 
4. Use JPA
5. Need to use REST
6. Needs to be Web app
7. 

Run with a profile
1. In IntellJ, activiate the profile on the TodoApplication
2. mvn spring-boot:run -Dspring-boot.run.profiles=localmysql
3. java -jar target/todo-0.0.1-SNAPSHOT.jar
4. java -jar target/todo-0.0.1-SNAPSHOT.jar --spring.profiles.active=localmysql
Test manually
curl http://localhost:8080/api/v1/tasks/check
curl http://localhost:8080/actuator/health