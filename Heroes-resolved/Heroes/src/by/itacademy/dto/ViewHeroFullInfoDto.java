package by.itacademy.dto;

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
public class ViewHeroFullInfoDto {

    private String name;
    private String identity;
    private String gender;
    private int age;
    private String abilityName;
}