package com.an.antry.kfk;

public class KafkaConsumerProducerDemo {
    public static void main(String[] args) {
        KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);
        producerThread.start();

        KafkaConsumer consumerThread = new KafkaConsumer(KafkaProperties.topic);
        consumerThread.start();

        // KafkaConsumerLoad consumerLoadThread = new KafkaConsumerLoad(KafkaProperties.topic);
        // consumerLoadThread.start();
    }
}
