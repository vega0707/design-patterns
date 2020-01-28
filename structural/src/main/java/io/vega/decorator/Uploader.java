package io.vega.decorator;

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
     * 上传通用接口,不使用设计模式写法
     * @param data 需要上传的数据
     */
    void upload1(List<Integer> data);

    /**
     * 上传通用接口,使用静态代理写法
     * @param data 需要上传的数据
     */
    void upload2(List<Integer> data);

    /**
     * 上传通用接口,使用包装器模式写法
     * @param data 需要上传的数据
     */
    void upload3(List<Integer> data);

    /**
     * 上传单个数据
     * @param datum
     */
    void upload1(Integer datum);

    /**
     * 上传单个数据
     * @param datum
     */
    void upload2(Integer datum);

    /**
     * 上传单个数据
     * @param datum
     */
    void upload3(Integer datum);
}
