# Apache-Camel-ActiveMQ

```
Apache ActiveMQ is an open source , java based message broker which supports a wide range of transport
protocols including REST,MQTT, AQMP, & WebSockets 

Use Cases:

Transactional messages
Clustering and asynchronous messaging model
Streaming of data (stock prices, chats)
```

```
what we'll build:
```

<img width="703" alt="Screenshot 2023-02-25 at 1 35 52 AM" src="https://user-images.githubusercontent.com/43849911/221280062-5c09cd62-035e-4561-9fc6-c32f18b291e0.png">

https://activemq.apache.org/installation
https://www.javatpoint.com/jms-tutorial

```

cd apache-activemq-5.17.3
./bin/activemq start

Connection factory uses cache factory by default to enable message brokers

```

<img width="807" alt="Screenshot 2023-02-25 at 1 46 19 AM" src="https://user-images.githubusercontent.com/43849911/221282427-a546315d-2df1-4b69-b94e-08e02a0c8a61.png">

<img width="1091" alt="Screenshot 2023-02-25 at 1 46 41 AM" src="https://user-images.githubusercontent.com/43849911/221282477-8aa9a781-645c-42bf-aa31-0afb7847ef2c.png">

<img width="1087" alt="Screenshot 2023-02-25 at 1 54 55 AM" src="https://user-images.githubusercontent.com/43849911/221284483-b217f27d-195f-4e4a-ad04-3a6fe32bf928.png">

<img width="1275" alt="Screenshot 2023-02-25 at 2 14 01 AM" src="https://user-images.githubusercontent.com/43849911/221287816-f4e64f2e-db99-431d-ad19-8b2f6dd4d706.png">

<img width="1083" alt="Screenshot 2023-02-25 at 2 15 16 AM" src="https://user-images.githubusercontent.com/43849911/221288000-baf7f4b3-e8ff-4a85-b1cd-7728b3517c36.png">

<img width="1082" alt="Screenshot 2023-02-25 at 2 15 48 AM" src="https://user-images.githubusercontent.com/43849911/221288080-fc7ad7eb-55a0-40e7-b764-301cd7fbeb86.png">

<img width="1079" alt="Screenshot 2023-02-25 at 2 16 58 AM" src="https://user-images.githubusercontent.com/43849911/221288250-b83813ce-f80d-4394-a148-39d67c4d2801.png">

<img width="1172" alt="Screenshot 2023-02-25 at 2 18 23 AM" src="https://user-images.githubusercontent.com/43849911/221288483-a0d73de1-cb97-4e8e-9cfc-063fbc2c8dea.png">

<img width="785" alt="Screenshot 2023-02-25 at 2 19 06 AM" src="https://user-images.githubusercontent.com/43849911/221288622-2d043571-0f76-436b-97fb-55d4e508df23.png">

<img width="795" alt="Screenshot 2023-02-25 at 2 19 42 AM" src="https://user-images.githubusercontent.com/43849911/221288704-67ebae35-b7b6-49cd-986c-df63c6929112.png">

<img width="543" alt="Screenshot 2023-02-25 at 2 21 31 AM" src="https://user-images.githubusercontent.com/43849911/221289109-e8bf93e7-4a6c-4910-bab9-84429c03680b.png">

```
cd apache-activemq-5.17.3
./bin/activemq start
INFO: Loading '/Users/saiashish/Downloads/apache-activemq-5.17.3//bin/env'
INFO: Using java '/usr/bin/java'
INFO: Starting - inspect logfiles specified in logging.properties and log4j.properties to get details
INFO: pidfile created : '/Users/saiashish/Downloads/apache-activemq-5.17.3//data/activemq.pid' (pid '9293')
```

```
./bin/activemq stop 
INFO: Loading '/Users/saiashish/Downloads/apache-activemq-5.17.3//bin/env'
INFO: Using java '/usr/bin/java'
INFO: Waiting at least 30 seconds for regular process termination of pid '9293' : 
Java Runtime: Amazon.com Inc. 17.0.5 /Users/saiashish/Library/Java/JavaVirtualMachines/corretto-17.0.5/Contents/Home
  Heap sizes: current=67584k  free=65106k  max=1048576k
    JVM args: -Xms64M -Xmx1G -Djava.util.logging.config.file=logging.properties -Djava.security.auth.login.config=/Users/saiashish/Downloads/apache-activemq-5.17.3//conf/login.config --add-reads=java.xml=java.logging --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.naming/javax.naming.spi=ALL-UNNAMED --add-opens=java.rmi/sun.rmi.transport.tcp=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.base/java.util.concurrent.atomic=ALL-UNNAMED --add-exports=java.base/sun.net.www.protocol.http=ALL-UNNAMED --add-exports=java.base/sun.net.www.protocol.https=ALL-UNNAMED --add-exports=java.base/sun.net.www.protocol.jar=ALL-UNNAMED --add-exports=jdk.xml.dom/org.w3c.dom.html=ALL-UNNAMED --add-exports=jdk.naming.rmi/com.sun.jndi.url.rmi=ALL-UNNAMED -Dactivemq.classpath=/Users/saiashish/Downloads/apache-activemq-5.17.3//conf:/Users/saiashish/Downloads/apache-activemq-5.17.3//../lib/: -Dactivemq.home=/Users/saiashish/Downloads/apache-activemq-5.17.3/ -Dactivemq.base=/Users/saiashish/Downloads/apache-activemq-5.17.3/ -Dactivemq.conf=/Users/saiashish/Downloads/apache-activemq-5.17.3//conf -Dactivemq.data=/Users/saiashish/Downloads/apache-activemq-5.17.3//data -Djolokia.conf=file:/Users/saiashish/Downloads/apache-activemq-5.17.3//conf/jolokia-access.xml
Extensions classpath:
  [/Users/saiashish/Downloads/apache-activemq-5.17.3/lib,/Users/saiashish/Downloads/apache-activemq-5.17.3/lib/camel,/Users/saiashish/Downloads/apache-activemq-5.17.3/lib/optional,/Users/saiashish/Downloads/apache-activemq-5.17.3/lib/web,/Users/saiashish/Downloads/apache-activemq-5.17.3/lib/extra]
ACTIVEMQ_HOME: /Users/saiashish/Downloads/apache-activemq-5.17.3
ACTIVEMQ_BASE: /Users/saiashish/Downloads/apache-activemq-5.17.3
ACTIVEMQ_CONF: /Users/saiashish/Downloads/apache-activemq-5.17.3/conf
ACTIVEMQ_DATA: /Users/saiashish/Downloads/apache-activemq-5.17.3/data
Connecting to pid: 9293
Stopping broker: localhost
.. TERMINATED
```
