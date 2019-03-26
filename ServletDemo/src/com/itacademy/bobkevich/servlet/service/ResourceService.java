package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.ResourceDao;
import com.itacademy.bobkevich.servlet.entity.Genre;
import com.itacademy.bobkevich.servlet.entity.Resource;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

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

    public Optional<Resource> findOne(Integer id) {
        return ResourceDao.getResourceDao().findOne(id);
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
