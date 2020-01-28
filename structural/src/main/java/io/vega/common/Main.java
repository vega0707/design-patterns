package io.vega.common;

import io.vega.DataBase;

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

    public static void main(String[] args) {
        new CommonUploader().upload(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(DataBase.TABLE);
        new SingleUploader().upload(Arrays.asList(6, 6, 7, 10));
        System.out.println(DataBase.TABLE);
        new ClearBeforeUploader().upload(Arrays.asList(6, 6, 7, 10));
        System.out.println(DataBase.TABLE);
    }

}
