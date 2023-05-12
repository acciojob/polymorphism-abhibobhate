package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();

        System.out.println(p.product(1,2));

        System.out.println(p.product(1,2,3));

        double x=1.0,y=2.0;

        System.out.println(p.product(x,y));
    }
}