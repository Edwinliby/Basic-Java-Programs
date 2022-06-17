import java.util.Scanner;

public class Second_smallest {
    public static void main(String args[]){
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = data.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i =0; i<n; i++)
        {
            a[i] = data.nextInt();
        }
        int temp;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array element:");
        for(int j=0; j<n;j++)
            System.out.print(a[j]+ " ");
        System.out.println();
        System.out.println("The Second smallest element:" + a[1]);
    }    
}
