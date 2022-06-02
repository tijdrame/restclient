package com.emard.restclient.web;

import com.emard.restclient.domain.JWTToken;
import com.emard.restclient.domain.LoginVM;
import com.emard.restclient.interfaces.ILogin;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MyTestController {
    private final ILogin sampleClient;
    

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
        MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, path = "/authenticate")
    public ResponseEntity<JWTToken> authorize(@RequestBody LoginVM loginVM) {

        ResponseEntity<JWTToken> authorize = sampleClient.authorize(loginVM);
        return authorize;
    }

    @GetMapping
    public String test() {
        return "yeahhhh";
    }
}
