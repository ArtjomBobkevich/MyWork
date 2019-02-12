package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Inter one=new Inter(3);
        Inter one2=new Inter(7);
        Inter one3=new Inter(3);
        Inter one4=new Inter(-1);
        Inter one5=new Inter(2);
        Inter one6=new Inter(3);
        Inter one7=new Inter(7);
        Inter one8=new Inter(2);
        Inter one9=new Inter(15);
        Inter one10=new Inter(15);

        List<Inter> list=new ArrayList<>();
        list.add(one);
        list.add(one2);
        list.add(one3);
        list.add(one4);
        list.add(one5);
        list.add(one6);
        list.add(one7);
        list.add(one8);
        list.add(one9);
        list.add(one10);

        Set<Inter> set = new HashSet<>();
        set.add(one);
        set.add(one2);
        set.add(one3);
        set.add(one4);
        set.add(one5);
        set.add(one6);
        set.add(one7);
        set.add(one8);
        set.add(one9);
        set.add(one10);
        System.out.println(list);
        System.out.println(set);
    }
}
