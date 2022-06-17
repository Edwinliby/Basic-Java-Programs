import java.util.Scanner;

public class Palindrome {
public static void main(String args[]){
    int flag =0;
    Scanner data = new Scanner(System.in);
    System.out.println("Enter the string:");
    String S = data.nextLine();
    int n = S.length();
    for( int i=0; i<n/2; i++)
    {
        if(S.charAt(i) != S.charAt(n-i-1))
        flag=1;
    }
    if(flag == 0)
        System.out.println("String is palindrome.");
    else
        System.out.println("String is not palindrome.");
  }    
}
