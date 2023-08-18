public class Hollow_Diamond {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <=2*n-1; row++) {
            for (int col = 1; col <=2*n-1; col++) {
                if ((col + row) == 5 || (row + col) == 11 || (col - row) == 3 || (row - col) == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

