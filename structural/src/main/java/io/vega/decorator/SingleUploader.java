package io.vega.decorator;

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

    @Override
    public void upload1(List<Integer> data) {
        data.forEach(this::upload1);
    }

    @Override
    public void upload1(Integer datum) {
        if (!Main.TABLE.contains(datum)) {
            Main.TABLE.add(datum);
        }
    }

    private Uploader commonUploader = new CommonUploader();

    @Override
    public void upload2(List<Integer> data) {
        data.forEach(this::upload2);
    }

    @Override
    public void upload2(Integer datum) {
        if (!Main.TABLE.contains(datum)) {
            commonUploader.upload2(datum);
        }
    }

    public SingleUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    private Uploader uploader;

    @Override
    public void upload3(List<Integer> data) {
        data.forEach(this::upload3);
    }

    @Override
    public void upload3(Integer datum) {
        if (!Main.TABLE.contains(datum)) {
            uploader.upload3(datum);
        }
    }
}
