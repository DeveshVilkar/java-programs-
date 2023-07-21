package com.jp.basic;

import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfect(int b){
        int sum=0;
        for (int i=1;i<b;i++){
            if (b%i==0){
                sum=sum+i;
            }
        }
        if(sum==b){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isPerfect(a));
    }
}
