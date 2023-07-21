import java.util.Scanner;

public class Swaping {
    public static void swap(int c,int k){
        int w=c;
        c=k;
        k=w;
        System.out.println("1st numbar ="+c);
        System.out.println("2nd number="+k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st number=");
        int a=sc.nextInt();
        System.out.print("enter the 2nd number =");
        int b=sc.nextInt();
        swap(a,b);
    }
}
