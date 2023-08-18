public class Inverted_PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        for (int row=0;row<n;row++){
            for (int space=0;space<=row;space++){
                System.out.print(" ");
            }
            for (int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
