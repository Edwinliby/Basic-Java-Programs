import java.util.Scanner;
public class try_catch {
    int n1,n2,result;
    Scanner data = new Scanner(System.in);
    void division() throws ArithmeticException
    {
        System.out.println("Enter two numbers:");
        n1 = data.nextInt();
        n2 = data.nextInt();
        result =n1/n2;
        System.out.println("Result="+result);
    }
    public static void main(String args[]){
        try{
            try_catch obj = new try_catch();
            obj.division();
        }
        catch(ArithmeticException ae){
            System.out.println("Exception occured"+ ae);
        }
        finally{
            System.out.println("Program proceeds");
        }
        System.out.println("End of program");
    }
}
