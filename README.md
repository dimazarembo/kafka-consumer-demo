# Kafka consumer demo
This is a simple Kafka consumer demo built with **Spring Boot**. It reads messages from **Apache Kafka** topic. This project is designed to work alongside the [Kafka Producer Demo](https://github.com/dimazarembo/kafka-producer-demo) as producer of messages to Kafka.

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.3-green)
![Kafka](https://img.shields.io/badge/Apache%20Kafka-2.8.0-blue)


## Kafka

To start kafka use docker-compose.yaml from [Kafka Producer Demo](https://github.com/dimazarembo/kafka-producer-demo) where you need to add <ip> for advertised_listeners

### Run app
1. Install Java 17 and Maven.
2. Clone the repository: `git clone https://github.com/dimazarembo/kafka-consumer-demo.git`
3. Navigate to the project directory: `cd kafka-consumer-demo`
4. Rename `application-example.properties` to `application.properties`
5. 
```bash
cd kafka-consumer-demo/src/main/resources
mv application-example.properties application.properties
```

5. Add your kafka bootstrap ips

```bash
nano application.properties
```

6. Run the application: `mvn spring-boot:run`


## Endpoints
Just produce messages to Kafka with topic "orders"
