import java.util.Scanner;

public class NoofDigits {
    public static void digits(int d){
        int count=0;
        while(d!=0) {
            int lastdig = d % 10;
            count++;
            d = d / 10;
        }
            System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number =");
        int c=sc.nextInt();
        digits(c);

    }
}
