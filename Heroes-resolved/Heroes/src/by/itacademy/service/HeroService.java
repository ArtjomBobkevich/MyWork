package by.itacademy.service;

import by.itacademy.dao.HeroDao;
import by.itacademy.dto.CreateNewHeroDto;
import by.itacademy.dto.ViewHeroBasicInfoDto;
import by.itacademy.dto.ViewHeroFullInfoDto;
import by.itacademy.entity.Ability;
import by.itacademy.entity.Hero;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 1 on 11.03.2018.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class HeroService {

    private static final HeroService INSTANCE = new HeroService();

    public List<ViewHeroBasicInfoDto> findAll() {
        return HeroDao.getInstance().findAll().stream()
                .map(it -> new ViewHeroBasicInfoDto(it.getId(), it.getName()))
                .collect(Collectors.toList());
    }

    public ViewHeroFullInfoDto findById(Long heroId) {
        return HeroDao.getInstance().findById(heroId)
                .map(it -> ViewHeroFullInfoDto.builder()
                        .name(it.getName())
                        .identity(it.getIdentity())
                        .abilityName(it.getAbility().getName())
                        .age(it.getAge())
                        .gender(it.getGender().getDescription())
                        .build())
                .orElse(null);
    }

    public ViewHeroBasicInfoDto save(CreateNewHeroDto dto) {
        Hero savedHero = HeroDao.getInstance().save(
                Hero.builder()
                        .name(dto.getName())
                        .age(dto.getAge())
                        .gender(dto.getGender())
                        .identity(dto.getIdentity())
                        .ability(Ability.builder().id(dto.getAbilityId()).build())
                        .build());

        return new ViewHeroBasicInfoDto(savedHero.getId(), savedHero.getName());
    }

    public static HeroService getInstance() {
        return INSTANCE;
    }
}
