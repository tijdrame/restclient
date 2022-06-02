package com.emard.restclient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class JWTToken {
    @JsonProperty("id_token")
    private String idToken;
}
