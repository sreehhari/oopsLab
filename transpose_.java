import java.util.Scanner;

 class Transpose{
 	public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
 	System.out.print("Enter the number of rows ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns ");
        int col = sc.nextInt();
        int mat[][]= new int [row][col];
        int tmat[][] = new int[col][row];//tmat=transpose
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tmat[j][i] = mat[i][j];
            }
        }
        System.out.println("Original Matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
         System.out.println("Transposed Matrix ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(tmat[i][j] + " ");
            }
            System.out.println();
        }
 	}
 }



