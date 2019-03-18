package com.itacademy.bobkevich.jdbc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private String login;
    private String first_name;
    private String last_name;
    private Integer age;
    private String mail;
    private String password;
    private PersonRole personRole;
}
