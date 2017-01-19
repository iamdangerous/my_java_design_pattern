package DecoratorPattern.example_2;

import java.io.*;

/**
 * Created by rkrde on 20-01-2017.
 */
public class App {
    public static void main(String[] args) throws IOException {
        File f = new File("src/DecoratorPattern/example_2/text.txt");
        LowerCaseInputStream lowerCaseInputStream
                = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(f)));

        int c;
        while ((c=lowerCaseInputStream.read()) !=-1){
            System.out.print((char) c);
        }
        lowerCaseInputStream.close();
    }
}
