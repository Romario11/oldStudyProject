/**
 * Created by nAz on 11/28/2015.
 */
import java.io.*;
public class Dispather {
    public static void main(String[] args) {
        m1();
        try {
            m2();
            m3();
        } catch (IOException e) {

        }


    }
    static void m1() {
        File file1 = new File("d:/intelij_proj/exceptionsExample/f1");

        try {
            file1.createNewFile();
        } catch (IOException e) {
        }


    }
    static void m2() throws IOException {
        File file2 = new File("d:/intelij_proj/exceptionsExample/f2");
        file2.createNewFile();

    }
    static void m3()throws IOException {
        File file3 = new File("d:/intelij_proj/exceptionsExample/f3");
        file3.createNewFile();

    }
}
