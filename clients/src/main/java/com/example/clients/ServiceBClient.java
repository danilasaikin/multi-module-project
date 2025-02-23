package com.example.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b")
public interface ServiceBClient {
    @GetMapping("/api/service-b/endpoint")
    String callServiceBEndpoint();
}
