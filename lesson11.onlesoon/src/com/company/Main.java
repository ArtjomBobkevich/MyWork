package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int [] array=new int[6];

        try {
            value(array);
        } catch (ValueException e){
            e.printStackTrace();
        }
    }



    public static void value (int [] array) throws ValueException {
        array [7]=4;
            throw new ValueException();
        }
    }
