package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Service1DownController {

    @GetMapping("/service1down/fallback")
    public Mono<String> getServ1DownReturn() {
        return Mono.just("Service1 is Down. Check after sometime");
    }
}
