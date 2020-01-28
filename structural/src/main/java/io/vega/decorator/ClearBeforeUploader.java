package io.vega.decorator;

import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Vega
 * @title: ClearBeforeUploader
 * @projectName design-patterns
 * @description: TODO
 * @date 2020/1/28 17:18
 */
@NoArgsConstructor
public class ClearBeforeUploader implements Uploader {

    @Override
    public void upload1(List<Integer> data) {
        Main.TABLE.clear();
        data.forEach(this::upload1);
    }

    @Override
    public void upload1(Integer datum) {
        Main.TABLE.add(datum);
    }

    private Uploader commonUploader = new CommonUploader();

    @Override
    public void upload2(List<Integer> data) {
        Main.TABLE.clear();
        data.forEach(this::upload2);
    }

    @Override
    public void upload2(Integer datum) {
        commonUploader.upload2(datum);
    }

    public ClearBeforeUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    private Uploader uploader;

    @Override
    public void upload3(List<Integer> data) {
        Main.TABLE.clear();
        data.forEach(this::upload3);
    }

    @Override
    public void upload3(Integer datum) {
        uploader.upload3(datum);
    }
}
