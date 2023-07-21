package com.jp.basic;

import java.util.Scanner;

public class StrongNumber {
    public static boolean isStrong(int b){
        int s=b;
        int sum=0;
        while(b!=0){
            int k=b%10;
            int pro=1;
            while (k>0){
                pro=pro*k;
                k--;
            }
            sum=sum+pro;
            b=b/10;
        }
        if (sum==s){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isStrong(a));
    }
}