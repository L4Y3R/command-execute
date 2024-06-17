package com.demo.cmdexecute.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommandDTO {
    private String command;
    private String user;
    private String device;
}
