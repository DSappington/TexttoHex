
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;


public class View_Hex {

    public static void main(String[] args) throws Exception {
        
    	Scanner scanner = new Scanner(System.in);
        System.out.print("This program will read input from a file and convert it to hexadecimal\n\n"); 
        System.out.print("Please Enter the full directory of the PlainText filename: ");
        File file = new File(scanner.nextLine());
        
        System.out.print("Please Enter the full directory of the Hex file you wish to write too: ");
        File hexFile = new File(scanner.nextLine());
        
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(file)); 
        		BufferedWriter output = new BufferedWriter(new FileWriter(hexFile));
        		) {
        	
            int i;

            while ((i = input.read()) != -1){
            	
            	String hexed = Integer.toHexString(i);
                System.out.print(Integer.toHexString(i) + " ");
                
            	output.write(hexed + " ");
            }
        }
        scanner.close();
    }
}