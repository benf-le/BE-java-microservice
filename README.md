# microservice app
run program
1. download axonserver: link download: https://download.axoniq.io/axonserver/axonserver-enterprise-2023.1.2-bin.zip
2. run axon(cmd)(port: 8024): D:\AxonServer-2023.1.2 -> cmd -> run: java -jar axonserver.jar 
3. run class DiscoverserverApplication
4. run h2_drive
5. run file pom.xml & run class BookserviceApplication, port 9001
6. run file pom.xml & run class EmployeeserviceApplication, port 9002
7. run file pom.xml & run class ApigatewayApplication, port 9000
8. download kafka: https://archive.apache.org/dist/kafka/3.2.0/kafka_2.13-3.2.0.tgz
9. - C:\kafka_2.13-3.2.0\bin\windows => turn on kafka in cmd: C:\kafka_2.13-3.2.0\bin\windows\cmd
   - run cmd => zookeeper-server-start.bat C:\kafka_2.13-3.2.0\config\zookeeper.properties
   - run cmd => kafka-server-start.bat C:\kafka_2.13-3.2.0\config\server.properties
   - (option)run cmd => kafka-topics.bat --create --topic your-name-topic --bootstrap-server localhost:9092
   - (option)run cmd => kafka-topics.bat --list --bootstrap-server localhost:9092
   - khi chạy code thì bật kafka-server-start.bat C:\kafka_2.13-3.2.0\config\server.properties


khi mà hàm addBook gửi cái command trong BookCommandController đc gọi thì nó sẽ nhảy qua CommandHandler bên class BookAggregate,