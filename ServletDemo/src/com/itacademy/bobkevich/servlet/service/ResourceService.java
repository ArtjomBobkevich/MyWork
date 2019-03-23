package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.ResourceDao;
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

    public static ResourceService getResourceService() {
        return RESOURCE_SERVICE;
    }
}
