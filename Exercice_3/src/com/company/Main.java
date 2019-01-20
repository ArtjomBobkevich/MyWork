package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String w=sc.nextLine();
	String w2=sc.nextLine();
	boolean rr;
	if(rr=w.equals(w2)) {
		System.out.println("Совпали" );
	}
	else if(rr=w.equalsIgnoreCase(w2)) {
		System.out.println("Регистр" );
	}
	else rr=(w.length()!=w2.length());
	System.out.println("Длина");
    }
}
