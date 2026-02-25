package sumofnumbersinfile;
import java.io.*;

public class SumofNumbersinFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\Filehandling\\Numbers.txt");
        BufferedReader br = new BufferedReader(fr);
        int sum = 0;
        String line;

        while ((line = br.readLine()) != null) {
            int num = Integer.parseInt(line);
            sum = sum + num;
        }

        System.out.println("Sum of numbers in file = " + sum);

        br.close();
        fr.close();
    }
}