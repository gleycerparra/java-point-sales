package com.projects.point_sales.generic;

public class UpdateEntity<T> extends CreateEntity {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
