package io.vega.Proxy;

import io.vega.Uploader;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Vega
 * @title: SingleUploader
 * @projectName design-patterns
 * @description: 校验唯一的
 * @date 2020/1/28 17:17
 */
@NoArgsConstructor
public class SingleUploader implements Uploader {

    private Uploader commonUploader = new CommonUploader();

    @Override
    public void upload(List<Integer> data) {
        data.forEach(this::upload);
    }

    @Override
    public void upload(Integer datum) {
        if (!Main.TABLE.contains(datum)) {
            commonUploader.upload(datum);
        }
    }

}
