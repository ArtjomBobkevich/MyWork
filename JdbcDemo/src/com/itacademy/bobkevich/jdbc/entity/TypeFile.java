package com.itacademy.bobkevich.jdbc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TypeFile {

    private Integer id;
    private String name;
}
