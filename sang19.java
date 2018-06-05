//File Handling in Java
import java.io.* ;
import java.util.Scanner;
import org.apache.commons.io.FileUtils; 
public class sang19{
       public static void main(String []args)
             {
                  Scanner var=new Scanner(System.in);
                  File f= new File("file1.txt"); 
                       String sang;
                       System.out.printf("Enter data into the file: ");
                       sang=var.nextLine(); 
                       FileUtils.writeStringToFile("file1.txt",sang); 
             }//end of main function 
        }//end of main class 
