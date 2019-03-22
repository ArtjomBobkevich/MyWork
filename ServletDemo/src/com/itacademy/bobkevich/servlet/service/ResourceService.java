package com.itacademy.bobkevich.servlet.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResourceService {

    private static final ResourceService RESOURCE_SERVICE=new ResourceService();

    public 

    public static ResourceService getResourceService() {
        return RESOURCE_SERVICE;
    }
}
