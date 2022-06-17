import java.util.Scanner;

public class Frequency_count{
    public static void main(String args[]){
        int i,j,sum=0;
        Scanner data =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = data.nextLine();
        int n= str.length();
        System.out.println("Enter the Letter to check frequency:");
        char s = data.nextLine().charAt(0);
        for( i=0; i<=n-1; i++)
        {
            if(str.charAt(i) ==s)
                sum++;
            else{
                System.out.println("Letter Not Found !!!");
                System.exit(0);
            }
        }
        System.out.println("Frequency:-"+ sum);
    }
}