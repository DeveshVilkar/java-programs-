public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        for (int row=1;row<2*n;row++){
            int totalcol=(row<=n)?row:2*n-row;
            int totalspace=n-totalcol;
            for (int space=1;space<=totalspace;space++){
                System.out.print(" ");
            }
            for (int col=1;col<=totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
