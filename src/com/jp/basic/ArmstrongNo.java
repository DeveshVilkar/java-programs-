package com.jp.basic;
import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNo {
    public static String isArmstrong(int b){
        int s=b;
        int count=0;
        while(s>0){
            s=s/10;
            count++;
        }

        int sum=0;
        while(s>0){
            int h=s%10;
            sum +=(int)Math.pow(h,count);
            s=s/10;
        }
        if (sum==b){
            return "it is armstrong number";
        }else{
            return "it is not armstrong number";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isArmstrong(a));
    }

}
