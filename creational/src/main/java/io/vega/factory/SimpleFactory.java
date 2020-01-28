package io.vega.factory;

import lombok.NoArgsConstructor;

/**
 * @author Vega
 * @title: SimpleFactory
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/13 21:24
 */
public class SimpleFactory {

    static class Apple {
        IPhone createIPhone(Class klass) {
            try {
                return IPhone.class.cast(klass.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    interface IPhone {
        /**
         * call
         */
        void call();
    }

    static class IPhoneX implements IPhone {
        @Override
        public void call() {
            System.out.println("this is iPhoneX");
        }
    }

    static class IPhone11 implements IPhone {
        @Override
        public void call() {
            System.out.println("this is iPhone11");
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        IPhone iPhone = apple.createIPhone(IPhoneX.class);
        iPhone.call(); // this is iPhoneX
        iPhone = apple.createIPhone(IPhone11.class);
        iPhone.call(); // this is iPhone11
    }
}
