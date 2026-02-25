package editcontent;
import java.io.*;
import java.util.Scanner;
public class EditContent {

    public static void main(String[] args) throws Exception {
        String input=("E:\\Filehandling\\input.txt");
        FileWriter fw=new FileWriter(input);
        fw.write("greeting for birthday party\n");
        fw.write("welcome all\n");
        fw.close();
        System.out.println("Input file created and text written.");

        File inputfile = new File(input);
        Scanner sc = new Scanner(inputfile);

        String output = "E:\\Filehandling\\output.txt";
        FileWriter fwOut = new FileWriter(output);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            fwOut.write(line.toUpperCase() + "\n");
        }

        sc.close();
        fwOut.close();

        System.out.println("Content Edited to Uppercase and written to output file.");
    }
}  
    
    

    

