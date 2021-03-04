package com.company;

import myObjects.MyContainer;

public class Main {

    public static void main(String[] args) {
        MyContainer container = new MyContainer();
        for(int i = 1; i < 18; i++) {
            container.add(i);
        }
        System.out.println(container.get(12));
        System.out.println(container.includes(18));
        System.out.println(container.indexOf(8));
        container.remove(2);
    }
}
