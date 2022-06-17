import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        int i,flag = 0;
        Scanner data = new Scanner(System.in);
        System.out.println("Note: 0 & 1 is neither prime or composite numbers.)");
        System.out.println("Enter the number:");
        int n = data.nextInt();
        for(i=2; i<=n/2 ;i++)
        {
            if(n%i == 0)
            {
                flag=1;
                break;
            }
        }
        if(flag == 0)
        System.out.println(n + " Number is prime");
        else
        System.out.println(n + " Number is not prime");
    }
}