package io.vega.decorator;

import io.vega.Uploader;

import java.util.List;

/**
 * @author Vega
 * @title: CommonUploader
 * @projectName design-patterns
 * @description: 普通上传方式
 * @date 2020/1/28 17:13
 */
public class CommonUploader implements Uploader {

    @Override
    public void upload(List<Integer> data) {
        data.forEach(this::upload);
    }
}
