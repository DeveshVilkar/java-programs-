package com.jp.basic;

import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeon(int k){
        int b=k*k;
        int sum=0;
        while(b>0){
            int r=b%10;
            sum=sum+r;
            b=b/10;
        }
        if (sum==k){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isNeon(a));
    }
}
