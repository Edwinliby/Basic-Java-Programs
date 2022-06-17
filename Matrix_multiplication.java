import java.util.Scanner;

public class Matrix_multiplication
{
 public static void main(String args[])
 {
    int r1,c1,r2,c2;
    int i,j;
    Scanner data = new Scanner(System.in);
    System.out.println("Enter the row of matrix 1:");
    r1 = data.nextInt(); 
    System.out.println("Enter the column of matrix 1:"); 
    c1= data.nextInt();
    System.out.println("Enter the row of matrix 2:");
    r2 = data.nextInt(); 
    System.out.println("Enter the column of matrix 2:"); 
    c2 = data.nextInt();
    if(c1 != r2)
    {
        System.out.println("Matrices can't be multiplied");
        System.exit(0);
    }
    else
    {
    int a[][] = new int[r1][c1];
    int b[][] = new int[r2][c2];
    int c[][] = new int[r1][c2];
    System.out.println("Enter elements of matrix 1:"); 
    for(i=0; i<r1; i++)
    { 
        for(j=0; j<c1; j++)
        {
            System.out.print("A["+i+"]"+"["+j+"] =");
            a[i][j] = data.nextInt();
        }    
    }
    System.out.println("Enter elements of matrix 2:");
    for(i=0; i<r2; i++)
    {
        for(j=0; j<c2; j++)
        {
            System.out.print("B["+i+"]"+"["+j+"] =");
            b[i][j] = data.nextInt();
        }
    }
    for(i=0; i<r1; i++)
        {
            for(j=0; j<c2; j++)
            {
                for(int k=0; k<c1; k++)
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    System.out.println("Final Matrix after multiplied:-");
    for(i=0; i<r1; i++)
        {
            for(j=0; j<c2; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");     
        }
    }
  }
}



