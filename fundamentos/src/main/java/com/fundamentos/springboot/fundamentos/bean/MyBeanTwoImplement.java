package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("From my bean implementation 2");
    }
}
