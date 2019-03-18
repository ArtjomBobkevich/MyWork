package com.itacademy.bobkevich.jdbc.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Resource {
    private Integer id;
    private String resourceName;
    private TypeFile typeFile;
    private Category category;
    private Person person;
    private String url;
    private Integer size;
}
