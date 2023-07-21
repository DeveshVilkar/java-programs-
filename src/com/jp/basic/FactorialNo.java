package com.jp.basic;

import java.util.Scanner;

public class FactorialNo {
    public static void facto(int b){
         int pro=1;
         while(b>0){
             pro=pro*b;
             b--;
         }
        System.out.println(pro);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        facto(a);
    }
}