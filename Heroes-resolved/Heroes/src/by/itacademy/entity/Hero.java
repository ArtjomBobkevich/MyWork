package by.itacademy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 1 on 11.03.2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hero {

    private Long id;
    private String name;
    private String identity;
    private Integer age;
    private Gender gender;
    private Ability ability;
}
