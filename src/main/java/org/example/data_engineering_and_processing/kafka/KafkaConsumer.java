package org.example.data_engineering_and_processing.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "iot_topic",id = "iot")
    public void handleNotification(String iot){

        log.info("Data from iot -{}", iot);
    }
}
