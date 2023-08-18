public class HollowPascalTriangle {
    public static void main(String[] args) {
        int n=4;
        for (int row=1;row<=n;row++){
            for (int col=1;col<=2*n-1;col++){
                if ((row+col)==5 || row==n ||(col-row)==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
