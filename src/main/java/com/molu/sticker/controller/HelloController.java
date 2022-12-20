package com.molu.sticker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {
    @GetMapping("/test")
    public Mono<ResponseEntity<TempDto>> test(){
        return Mono.just(ResponseEntity.ok(
                TempDto.builder()
                        .name("juno! v2")
                        .build()));
    }
}