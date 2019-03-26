package by.itacademy.entity;

import lombok.Getter;

/**
 * Created by 1 on 11.03.2018.
 */
@Getter
public enum Gender {

    MALE("Мужчина"),
    FEMALE("Женщина");

    private String description;

    Gender(String description) {
        this.description = description;
    }
}
