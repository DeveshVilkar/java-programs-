import java.util.Scanner;
public class Factors {
    public static void fact(int c){
        for (int i=1;i<=c;i++) {
            if(c%i==0){
            System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number =");
        int b=sc.nextInt();
        fact(b);


    }
}
