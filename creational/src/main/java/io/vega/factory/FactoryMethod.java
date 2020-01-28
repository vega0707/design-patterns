package io.vega.factory;

import static java.lang.System.out;

/**
 * @author Vega
 * @title: FactoryMethod
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/14 20:50
 */
public class FactoryMethod {

    abstract static class PhoneFactory{
        /**
         * createPhone
         * @return Phone
         */
        abstract Phone createPhone();
    }

    static class Apple extends PhoneFactory{
        @Override
        Phone createPhone() {
            return out::println;
        }
    }

    static class HuaWei extends PhoneFactory{
        @Override
        Phone createPhone() {
            return out::print;
        }
    }

    interface Phone{
        /**
         * call
         * @param content
         */
        void call(String content);
    }

    public static void main(String[] args) {
        PhoneFactory factory = new HuaWei();
        factory.createPhone().call("hello");
        factory.createPhone().call("world");
        factory = new Apple();
        factory.createPhone().call("hello");
        factory.createPhone().call("world");
    }
}
