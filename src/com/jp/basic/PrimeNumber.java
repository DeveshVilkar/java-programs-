import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int b){
        int count=0;
        for (int i=2;i<=b;i++){
            if (b%i==0){
                count++;
            }
        }
        if (count==1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }
}
