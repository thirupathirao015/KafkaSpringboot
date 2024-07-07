# KafkaSpringboot
## 1. Create Springboot with kafka project 
   Reqired dependencies are : Spring web and Spring kafka are required for producer and consumer examples.
   When we create project in //spring.io.start  Spring boot version 3 and Jdk 17 required. 
   
## 2.1 kafka download 
    https://kafka.apache.org/downloads

## 2.2  We have to Run below commands from kafka folder 
open cmd(command line from kafka software folder)
Below 2 commands are run with 2 different cmd only.
	 
=> One Command for Zookeeper with one CMD   
``` .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties ```
 
=> Another command for Kafka with another CMD  
``` .\bin\windows\kafka-server-start.bat .\config\server.properties ``` 


## Server Runing Test:
``` http://localhost:8080/actuator/health ```

## Kafka Testing:
``` http://localhost:8080/rest/api/producer?message="First kafka example" ```

**You will get response from Consumer and it will print console output if you print.** 

-----------------------------------------------------------------------------------------------
**Note :: Finding and killing process running on port 8080 on windows
Similarly, You can run the following command to identify a process running on a port in windows.
Run below commands in cmd administrators** 

``` -> netstat -ona | findstr :8080 | findstr LISTENING ```

``` -> taskkill /PID 25321 /F ```
