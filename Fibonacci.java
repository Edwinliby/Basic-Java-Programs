import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        int n,n1=0,n2=1,n3;
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = data.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print(" "+n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
