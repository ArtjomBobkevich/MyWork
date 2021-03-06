package com.itacademy.bobkevich.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class Genre {

    private Integer id;
    private String name;
    @Builder.Default
    private Set<Resource> resources =new HashSet<>();
}
