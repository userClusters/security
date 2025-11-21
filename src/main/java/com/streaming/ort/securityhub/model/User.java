package com.streaming.ort.securityhub.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private String nome;
    private String cognome;
}
