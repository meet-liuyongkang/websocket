package com.boyuan.erp;

import java.util.*;

//这是单行注释
public class HelloWorld {

    private static final int LIST = 10;

    public static void main(String[] args) {
        System.out.println("hello world!");
        List<String> list = new ArrayList<String>();
        getList();
    }

    private static void getList() {
        System.out.println("");
        System.out.println("hello world!");
        Map<String, String> map = new HashMap<String, String>();
        Date date = new Date();
        System.out.println("HelloWorld.getList");

    }

    public void saa() {
        StringBuffer sb = new StringBuffer();
        ArrayList list = new ArrayList();
        list.add(null);
    }

    public static int getLIST() {
        return LIST;
    }
}
