package com.fundamentos.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int sum(int numero) {
        return numero + 1;
    }
}
