package com.codegym.hairstyle.service;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ServiceResult {
    private StatusService status = StatusService.SUCCESS;
    private String message;
    private Object data;
}
