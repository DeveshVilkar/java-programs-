public class Hollow_Square_Star {
    public static void main(String[] args) {
        int n=5;
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                if (row==1 || row==n || col==1 ||col==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
