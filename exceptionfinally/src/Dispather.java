import java.io.File;
import java.io.IOException;

/**
 * Created by nAz on 11/28/2015.
 */
public class Dispather {
    public static void main(String[] args) {
        try {
            m();
        } catch (IOException e) {
            System.out.println("Catch");
        }

    }
   static void m () throws IOException{
       try {
           System.out.println("Start");
           File file1 = new File("d:/intelij_proj/exceptionfinally/f1");
           file1.createNewFile();
          // if(true)throw new IOException();
           System.out.println("End");
       }finally {

           System.out.println("Close");
           if(true)throw new IOException();
       }


    }
}
