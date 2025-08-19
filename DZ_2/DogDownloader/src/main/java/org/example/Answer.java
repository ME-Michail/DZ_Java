package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {
    String message;
    String status;
    String code;
    public Answer(@JsonProperty("message") String message,
                  @JsonProperty("status") String status,
                  @JsonProperty("code")String code) {
        this.message = message;
        this.status= status;
        this.code = code;
    }
}
