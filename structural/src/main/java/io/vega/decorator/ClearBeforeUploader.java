package io.vega.decorator;

import io.vega.DataBase;
import io.vega.Uploader;
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

    public ClearBeforeUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    private Uploader uploader;

    @Override
    public void upload(List<Integer> data) {
        DataBase.TABLE.clear();
        uploader.upload(data);
    }
}
