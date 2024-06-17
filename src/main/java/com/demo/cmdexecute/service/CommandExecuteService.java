package com.demo.cmdexecute.service;

import com.demo.cmdexecute.DTO.CommandDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CommandExecuteService {
    @KafkaListener(topics = "command_topic", groupId = "command_execute_group")
    public void listen(CommandDTO message) {
        System.out.println("Received Message in group command_execute_group: " + message);
    }
}
