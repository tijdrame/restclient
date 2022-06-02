package com.emard.restclient.interfaces;

import com.emard.restclient.domain.JWTToken;
import com.emard.restclient.domain.LoginVM;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import feign.Headers;
// import feign.RequestLine;

//@Headers("Accept: application/json")
//@FeignClient(url = "${sample.client.url}") //, configuration = SampleClientConfiguration.class)
@FeignClient(value= "sampleclient", url = "http://localhost:8089/api/") //, configuration = SampleClientConfiguration.class)
public interface ILogin {
    // static final String POST = "POST ";
    // static final String LOGIN = POST +"/authenticate";


    // @Headers("Content-Type: application/json")
    // @RequestLine(LOGIN)
    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
        MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, path = "/authenticate")
    public ResponseEntity<JWTToken> authorize(@RequestBody LoginVM loginVM);
}
