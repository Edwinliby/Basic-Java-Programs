import java.util.*;

class stringToken {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter sequence of numbers: ");
        String digit = data.nextLine();
        StringTokenizer token = new StringTokenizer(digit);
        int dig = 0, sum = 0;
        System.out.println("\nEntered digits are : ");
        while (token.hasMoreTokens()) 
        {
            String s = token.nextToken();
            dig = Integer.parseInt(s);
            System.out.print(dig + " ");
            sum = sum + dig;
        }
        System.out.println("Sum is : " + sum);
    }
}