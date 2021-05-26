This is microservice created in spring boot. We are creating sample
Rest APIs and trying to show how spring has seamless integration 
with swagger and we can include in our project and any remote user
can use it to figure out what all this application is about.

This is for getting documentation in doc format
1. Add dependency for swagger springfox in pom.xml
2. enable swagger by using annotation @EnableSwagger in main applicaiton
3. /v2/api-docs return swagger documentation in open api spec format awesome

But we can also get swagger UI too .

1. Add dependency for swagger springfox ui in pom.xml
2. enable swagger by using annotation @EnableSwagger in main applicaiton
3. /swagger-ui.html return swagger documentation in open api spec format awesome
