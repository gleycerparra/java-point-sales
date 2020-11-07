package com.projects.point_sales.util;

import com.projects.point_sales.generic.CreateEntity;
import com.projects.point_sales.generic.UpdateEntity;

public class Util {

    public static CreateEntity createHrefFromResource(Integer id) {
        CreateEntity createEntity = new CreateEntity();
        createEntity.setId(id.longValue());

        return createEntity;
    }

    public static <T> UpdateEntity<T> updateHrefFromResource(T data, Integer id) {
        UpdateEntity<T> updateEntity = new UpdateEntity<T>();
        updateEntity.setId(id.longValue());
        updateEntity.setData(data);
        
        return updateEntity;
    }

}
