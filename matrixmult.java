import java.util.Scanner;
class matrixmult{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row = input.nextInt();
		System.out.println("enter the number of columns");
		int col = input.nextInt();
		int mat1[][]  = new int [row][col];
		int mat2[][] = new int [row][col];
		int mult[][] = new int [row][col];
		
		//taking matrix input
		System.out.println("enter the values of the first matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat1[i][j]=input.nextInt();
			}
		}
		
		System.out.println("enter the values of the second matrix");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat2[i][j]=input.nextInt();
			}
		}		
		
		//multiplying the matrix
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mult[i][j]=0;
				for(int k=0;k<row;k++){
					mult[i][j]=mat1[i][k]*mat2[k][j];
				}
			//System.out.println("the resulting matrix is");
			System.out.print(mult[i][j]+" ");
			}
		System.out.println(" ");
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}





















}
