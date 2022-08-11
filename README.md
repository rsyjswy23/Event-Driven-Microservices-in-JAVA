# Event-Driven Microservices in Java using Spring boot, Spring cloud, Kafka and Elasticsearch.

In this project, I first stream data from Twitter and put them on a Kafka topic. Then I create Spring Cloud Config Server as a microservice to externalize the configurations. Then I use Kafka as event store and create a microservice(twitter_to_kafka) that subscribes to a Kafka topic and consumes the data that come into Kafka in realtime. Next, I create an event-driven microservice(kafka_to_elastic) that consumes data from kafka and put on Elasticsearch to make the data searchable effectively. Lastly, I create a elastic_query_microservice to query the data from Elasticsearch. 

This project follows the instruction of an [Udemy course by Ali Gelenler](https://www.udemy.com/course/event-driven-microservices-spring-boot-kafka-and-elasticsearch/)
## Architecture Overview on this repo:
![Untitled Diagram drawio](https://user-images.githubusercontent.com/101481587/184073294-42d5cda1-d3c4-45dc-b45f-6178c567ffad.svg)


## This system consists of 4 microservices:

-:white_check_mark: __twitter_to_kafka_microservices:__
  stream data from twitter and put them on Kafka topics.
  
  __Implementation steps:__
  1. run a Kafka cluster in docker using docker compose file,
  2. use Zookeeper to create a schema regisry,
  3. create Avro schema using avro-maven-plugin,
  4. create kafka-admin using adminClient class to create topics,
  5. use Spring kafka to implement Kafka producer to write data on a Kafka topic,
  6. use Twitter4j library to stream the data from twitter,
  7. containerize this microservice using docker compose,
  
-:white_check_mark: __spring_cloud_config_server_microservices:__
  externalize services config.
  
  Implementation steps:
  1. use Spring Cloud congif to define config git repo, push to Github and manege remotely,

-:white_check_mark: __kafka_to_elastic_microservices:__
  consumes data from Kafka in realtime and put data on Elasticsearch to make data searchable effectively.
  
  Implementation steps:
  1. 


-:white_check_mark: __elastic_query_microservices:__
  query the data from Elasticsearch.
  
  Implementation steps:
  1. 


## knowledge and documentations:

env setup: Java11, intelliJ, maven, git, docker

__About Microservices:__
> 1. Decouple the services and create resilient services because a service has no direct communication with other services. 2. It uses asynchronous/non-blocking communication between services. 3. Use an event/state store (Kafka), and remove the state from the services for better scalability

__About Kafka:__ https://kafka.apache.org/

__About Avro:__ https://www.confluent.io/blog/avro-kafka-data/
> Avro is an open source data serialization system that helps with data exchange between systems, programming languages, and processing frameworks. Avro helps define a binary format for your data, as well as map it to the programming language of your choice. 

Reasons to choose Avro: 
> It has a direct mapping to and from JSON
It has a very compact format. The bulk of JSON, repeating every field name with every single record, is what makes JSON inefficient for high-volume usage.
It is very fast.
It has great bindings for a wide variety of programming languages so you can generate Java objects that make working with event data easier, but it does not require code generation so tools can be written generically for any data stream.
It has a rich, extensible schema language defined in pure JSON
It has the best notion of compatibility for evolving your data over time.

__About Elasticsearch:__ https://aws.amazon.com/opensearch-service/the-elk-stack/what-is-elasticsearch/
> Elasticsearch is a distributed search and analytics engine built on Apache Lucene. It allows you to store, search, and analyze huge volumes of data quickly and in near real-time and give back answers in milliseconds. It's able to achieve fast search responses because instead of searching the text directly, it searches an index. Elasticsearch is a document oriented database. The entire object graph you want to search needs to be indexed, so before indexing your documents, they must be denormalized.

__About :__

__About :__


