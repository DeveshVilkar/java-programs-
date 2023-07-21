package com.jp.basic;

import java.util.Scanner;

public class XylemPhloem {
    public static String isXylemPhloem(int b){
        int og=b;
        int k=og%10;
        og=og/10;
        int pro=0;
        while(og!=0){
            int s=og%10;
            pro=pro*10+s;
            og=og/10;
        }
        int j=pro%10;
        pro=pro/10;
        int sum=0;
        while(pro!=0){
            int mid=pro%10;
            sum=sum+mid;
            pro=pro/10;
        }
        int fl=k+j;
        if (fl==sum){
            return "it is xylem";
        }else {
            return "it is phloem";
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isXylemPhloem(a));
    }
}
