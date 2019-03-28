package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.ResourceDao;
import com.itacademy.bobkevich.servlet.dto.ViewResourceBasicInfoDto;
import com.itacademy.bobkevich.servlet.dto.ViewResourceFullInfoDto;
import com.itacademy.bobkevich.servlet.entity.Genre;
import com.itacademy.bobkevich.servlet.entity.Resource;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResourceService {

    private static final ResourceService RESOURCE_SERVICE=new ResourceService();

    public Optional<Resource> findAllCommentsAboutThisResource(Integer resourceId){
        return ResourceDao.getResourceDao().findAllCommentsAboutThisResource(resourceId);
    }

    public Resource save(Resource resource) {
        return ResourceDao.getResourceDao().save(resource);
    }

    public Resource update(Resource resource) {
        return  ResourceDao.getResourceDao().update(resource);
    }

    public List<ViewResourceBasicInfoDto> findWhoHaveThisGenre() {


        return ResourceDao.getResourceDao().findAll().stream()
                .map(it-> new ViewResourceBasicInfoDto(it.getId(),it.getResourceName(),it.getTypeFile().getName(),it.getCategory().getName()))
                .collect(Collectors.toList());
    }

    public List<ViewResourceBasicInfoDto> findAll() {
        return ResourceDao.getResourceDao().findAll().stream()
                .map(it-> new ViewResourceBasicInfoDto(it.getId(),it.getResourceName(),it.getTypeFile().getName(),it.getCategory().getName()))
                .collect(Collectors.toList());
    }

    public ViewResourceFullInfoDto findOne(Long resourceId) {
        return ResourceDao.getResourceDao().findById(resourceId)
                .map(it->ViewResourceFullInfoDto.builder()
                        .resourceName(it.getResourceName())
                        .typeFile(it.getTypeFile().getName())
                        .category(it.getCategory().getName())
                        .person(it.getPerson().getLogin())
                        .url(it.getUrl())
                        .size(it.getSize())
                        .build())
                .orElse(null);
    }

    public boolean delete(Integer id) {
        return ResourceDao.getResourceDao().delete(id);
    }

    public Resource addGenre(Resource resource, Genre genre) {
        return ResourceDao.getResourceDao().addGenre(resource,genre);
    }

    public static ResourceService getResourceService() {
        return RESOURCE_SERVICE;
    }
}
