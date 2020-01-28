package io.vega.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vega
 * @title: Main
 * @projectName design-patterns
 * @description: TODO
 * @date 2020/1/28 16:58
 */
public class Main {
    /**
     * 数据仓库
     */
    public final static List<Integer> TABLE = new ArrayList<>();

    public static void main(String[] args) {
//        demo1();
//        demo2();
        demo3();
    }

    private static void demo3() {
        CommonUploader commonUploader = new CommonUploader();
        commonUploader.upload3(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(TABLE);
        SingleUploader singleUploader = new SingleUploader(commonUploader);
        singleUploader.upload3(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
        ClearBeforeUploader clearBeforeUploader = new ClearBeforeUploader(singleUploader);
        clearBeforeUploader.upload3(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
    }

    private static void demo2() {
        new CommonUploader().upload2(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(TABLE);
        new SingleUploader().upload2(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
        new ClearBeforeUploader().upload2(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
    }

    private static void demo1() {
        new CommonUploader().upload1(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(TABLE);
        new SingleUploader().upload1(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
        new ClearBeforeUploader().upload1(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
    }
}
