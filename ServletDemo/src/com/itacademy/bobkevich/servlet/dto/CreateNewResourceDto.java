package com.itacademy.bobkevich.servlet.dto;

import com.itacademy.bobkevich.servlet.entity.Category;
import com.itacademy.bobkevich.servlet.entity.Person;
import com.itacademy.bobkevich.servlet.entity.TypeFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateNewResourceDto {

    private String resourceName;
    private TypeFile typeFile;
    private Category category;
    private Person person;
    private String url;
    private Integer size;
}
