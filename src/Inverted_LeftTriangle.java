public class Inverted_LeftTriangle {
    public static void main(String[] args) {
        int n=5;
        for (int row=1;row<=n;row++){
            for (int space=0;space<row;space++){
                System.out.print(" ");
            }
            for (int col=5;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
