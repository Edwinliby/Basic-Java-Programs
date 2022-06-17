import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner data = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the three digit number:");
        int n = data.nextInt();
        int temp = n;
        while(n>0)
        {
            int n1;
            n1 = n%10;
            sum = sum + (n1*n1*n1);
            n = n/10;
        } 
        if( sum == temp)
        System.out.println(temp+" is a Armstrong number.");
        else
        System.out.println(temp+" is not a Armstrong number.");
    } 
}
