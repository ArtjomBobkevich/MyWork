package com.itacademy.bobkevich.servlet.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class Person {

    PersonRole user = PersonRole.builder()
            .id(2L)
            .build();

    private String login;
    private String first_name;
    private String last_name;
    private Long age;
    private String mail;
    private String password;
    private PersonRole personRole=user;
}
