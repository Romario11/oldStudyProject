import java.io.File;
import java.io.IOException;

/**
 * Created by nAz on 11/28/2015.
 */
public class Animal  {
    void eat() throws IOException{
        File file1 = new File("d:/intelij_proj/exceptionAndOverriding/f1");
        file1.createNewFile();

    }
}
