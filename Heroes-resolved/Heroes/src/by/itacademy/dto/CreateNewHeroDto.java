package by.itacademy.dto;

import by.itacademy.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 1 on 11.03.2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateNewHeroDto {

    private String name;
    private String identity;
    private Integer age;
    private Gender gender;
    private Long abilityId;
}
