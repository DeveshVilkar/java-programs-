public class StopWatch {
    public static void main(String[] args) {
        int n=4;
        for (int row=1;row<2*n;row++){
            int totalcol=(row<=n)?n-row+1:row-n+1;
            int totalspace=n-totalcol;
            for (int s=1;s<=totalspace;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
