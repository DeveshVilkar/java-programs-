import java.util.Scanner;

public class ReverseNo {
    public static int reverse(int c){
        int lastdigit=0;
        int res=0;
        while(c!=0){
             lastdigit=c%10;
             res=res*10+lastdigit;
             c=c/10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(reverse(a));
    }
}