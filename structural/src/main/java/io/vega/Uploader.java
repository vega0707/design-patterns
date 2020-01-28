package io.vega;

import io.vega.common.Main;

import java.util.List;

/**
 * @author Vega
 * @title: uploader
 * @projectName design-patterns
 * @description: 上传者
 * @date 2020/1/28 16:55
 */
public interface Uploader {
    /**
     * 上传单个数据
     * @param datum 需要上传的数据
     */
    default void upload(Integer datum){
        DataBase.TABLE.add(datum);
    }

    /**
     * 上传通用接口
     * @param data 需要上传的数据
     */
    void upload(List<Integer> data);

}
