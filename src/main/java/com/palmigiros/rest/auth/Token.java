package com.palmigiros.rest.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author carlos
 */
public class Token {

    String token;

    public Token(@JsonProperty("token") String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
