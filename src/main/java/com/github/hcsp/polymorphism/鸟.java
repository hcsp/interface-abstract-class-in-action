package com.github.hcsp.polymorphism;

public class 鸟 extends 活的动物 implements 会叫, 会飞 {
    @Override
    public void 会叫() {
        System.out.println("叽叽喳喳");
    }

    @Override
    public void 会飞() {
        System.out.println("鸟儿飞");
    }
}
