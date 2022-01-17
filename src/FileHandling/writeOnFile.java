package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeOnFile {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter newFileWriter=new FileWriter("hello.txt");
            newFileWriter.write("Learning java");
            newFileWriter.close();
            System.out.println("The program ended");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
