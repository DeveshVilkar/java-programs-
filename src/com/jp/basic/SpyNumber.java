package com.jp.basic;

import java.util.Scanner;

public class SpyNumber {
    public static boolean isSpy(int b){
        int sum=0;
        int pro=1;
        while(b>0){
            int k=b%10;
            sum=sum+k;
            pro=pro*k;
            b=b/10;
        }
        if(sum==pro){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isSpy(a));
    }
}
