package com.demo.cmdexecute.service;

import com.demo.cmdexecute.DTO.CommandDTO;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CommandExecuteService {

    private static final Logger logger = LoggerFactory.getLogger(CommandExecuteService.class);

    @KafkaListener(topics = "command_topic", groupId = "command_execute_group")
    public void consumer(ConsumerRecord<String, CommandDTO> record) {
        logger.info("Kafka Message Received");
        CommandDTO message = record.value();
        long offset = record.offset();
        System.out.println("Received Message in group command_execute_group: " + message + " Offset [" + offset + "]");
    }
}
