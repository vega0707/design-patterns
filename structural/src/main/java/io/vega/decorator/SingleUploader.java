package io.vega.decorator;

import io.vega.DataBase;
import io.vega.Uploader;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Vega
 * @title: SingleUploader
 * @projectName design-patterns
 * @description: 校验唯一的
 * @date 2020/1/28 17:17
 */
@NoArgsConstructor
public class SingleUploader implements Uploader {

    public SingleUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    private Uploader uploader;

    @Override
    public void upload(List<Integer> data) {
        data.forEach(this::upload);
    }

    @Override
    public void upload(Integer datum) {
        if (!DataBase.TABLE.contains(datum)) {
            uploader.upload(datum);
        }
    }
}
