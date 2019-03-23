# resource-service
small service allows client to load resources from server  like images and other resources

# prerequisites
config server should be up and run<br/>
<a href="https://github.com/JavaAdore/config-server">https://github.com/JavaAdore/config-server</a> <br/>
eureka server should be up and run<br/>
<a href="https://github.com/JavaAdore/eureka-server">https://github.com/JavaAdore/eureka-server</a> <br/>
 

zipkin server nice be up and run so you can track the request<br/>
<a href="https://github.com/JavaAdore/zipkin-server">https://github.com/JavaAdore/zipkin-server</a> <br/>

 
 


 

environment variables should be added

# ZIPKIN_SERVER_IP = 127.0.0.1
127.0.0.1 the ip of machine where zipkin server runs
# SLEUTH_LOGGING_LEVEL=info
   

# EUREKA_SERVER_IP      = 127.0.0.1
# EUREKA_SERVER_PORT    = 8761




# resource-service loads images from server to client
public @ResponseBody byte[] loadImage(@RequestParam("path") String path)

 

# build
as root/Administration <br/>
mvn clean install docker:removeImage docker:build
# run
java -jar target/resource-server.jar
