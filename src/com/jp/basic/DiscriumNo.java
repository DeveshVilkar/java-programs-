package com.jp.basic;

import java.util.Scanner;

public class DiscriumNo {
    public static String isDiscrium(int b){
        int og=b;
        int count=0;
        int sum=0;
        while(og>0){
            count++;
            og=og/10;
        }
        og=b;
        while(og>0){
            int lastno=og%10;
            sum=sum+(int)Math.pow(lastno,count);
            og=og/10;
            count--;
        }
        if (sum==b){
            return "it is discrium number";
        }else {
            return "it is not dicrium number";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isDiscrium(a));
    }
}
