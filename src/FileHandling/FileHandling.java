package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public  static  void main(String[] args) throws IOException {
        try{
//            CREATE NEW FILE
            File newFile=new File("hello.txt");
            if(newFile.createNewFile()){
                System.out.println("File name: "+ newFile.getName());
                System.out.println("Absolute path: "+ newFile.getAbsolutePath());
                System.out.println("Writable: "+ newFile.canWrite());
                System.out.println("Readable; "+ newFile.canRead());
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
