import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class file {
    public static void main(String args[]) {
        try {
            FileWriter File = new FileWriter("Edwin.txt");
            File.write("Hello there this is a test file.");
            File.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
        try {
            File obj = new File("Edwin.txt");
            Scanner File = new Scanner(obj);
            while(File.hasNextLine())
            {
                String data =File.nextLine();
                System.out.println(data);
            }
            File.close();
            System.out.println("Successfull");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found"+e);
        }
    }
}