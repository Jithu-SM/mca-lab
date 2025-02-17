import java.util.Scanner;
public class MatrixAddition{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns of first matrix: ");
		int m1=s.nextInt();
		int n1=s.nextInt();
		int mat1[][]=new int[m1][n1];
		System.out.println("Enter the first matrix: ");
		for(int i=0;i<m1;i++){
			for(int j=0;j<n1;j++) mat1[i][j]=s.nextInt();
		}
		System.out.println("Enter the number of rows and coloumns of second matrix: ");
                int m2=s.nextInt();
                int n2=s.nextInt();
		int mat2[][]=new int[m2][n2];
                System.out.println("Enter the second matrix: ");
                for(int i=0;i<m2;i++){
                        for(int j=0;j<n2;j++) mat2[i][j]=s.nextInt();
                }
		int sum[][]=new int[m1][n1];
		if(m1==m2 && n1==n2){
			for(int i=0;i<m1;i++){
                        	for(int j=0;j<n1;j++) sum[i][j]=mat1[i][j]+mat2[i][j];
			}
			System.out.println("Sum: ");
			for(int i=0;i<m1;i++){
                		for(int j=0;j<n1;j++) System.out.print(sum[i][j]+"\t");
				System.out.println();
			}
		}
		else System.out.println("Addition is not possible.");
	}
}
