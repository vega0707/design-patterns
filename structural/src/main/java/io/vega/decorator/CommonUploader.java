package io.vega.decorator;

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
    public void upload1(List<Integer> data) {
        data.forEach(this::upload1);
    }

    @Override
    public void upload1(Integer datum) {
        Main.TABLE.add(datum);
    }

    @Override
    public void upload2(List<Integer> data) {
        data.forEach(this::upload2);
    }

    @Override
    public void upload2(Integer datum) {
        Main.TABLE.add(datum);
    }

    @Override
    public void upload3(List<Integer> data) {
        data.forEach(this::upload3);
    }

    @Override
    public void upload3(Integer datum) {
        Main.TABLE.add(datum);
    }
}
