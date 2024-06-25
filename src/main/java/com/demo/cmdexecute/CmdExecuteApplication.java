package com.demo.cmdexecute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CmdExecuteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmdExecuteApplication.class, args);
    }

}
