import java.io.File;
import java.io.IOException;

/**
 * Created by nAz on 11/28/2015.
 */
public class Dog extends Animal  {
    void eat()throws IOException {
        File file2 = new File("d:/intelij_proj/exceptionAndOverriding/f2");
        file2.createNewFile();

    }
}
