package io.vega.Proxy;

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
        new CommonUploader().upload(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(TABLE);
        new SingleUploader().upload(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
        new ClearBeforeUploader().upload(Arrays.asList(6, 6, 7, 10));
        System.out.println(TABLE);
    }

}
