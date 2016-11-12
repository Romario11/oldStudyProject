import java.io.*;
import java.util.*;

/**
 * Created by ROMARIO on 17.12.2015.
 */
public class Dispather {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        Student s1 = new Student("SERJ",4.3);
        Student s2 = new Student("MARY",4.9);
        Student s3 = new Student("IVAN",3.2);
        Student s4 = new Student("ANN",4.7);
        Student s5 = new Student("LUCY",4.2);
        Student s6 = new Student("BOHDAN",4.8);
        Student s7 = new Student("PAUL",4.3);
        Student s8 = new Student("SERJ",2.7);
        Student s9 = new Student("MARY",4.8);
        Student s10 = new Student("BOHDAN",3.1);
        Student s11 = new Student("PAUL",4.1);
        Student s12 = new Student("ANTON",2.6);
       /* ArrayList <Student> g1 = new ArrayList();
        ArrayList <Student> g2 = new ArrayList();
        ArrayList <Student> g3 = new ArrayList();
        g1.add(s1);
        g1.add(s2);
        g1.add(s3);
        g1.add(s4);
        g2.add(s5);
        g2.add(s6);
        g2.add(s7);
        g2.add(s8);
        g3.add(s9);
        g3.add(s10);
        g3.add(s11);
        g3.add(s12);*/
        File file1 = new File("G1");
        File file2 = new File("G2");
        File file3 = new File("G3");
        ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("G1"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.writeObject(s4);
        oos.flush();
        oos.close();
        ObjectOutputStream oos1 = new ObjectOutputStream (new FileOutputStream("G2"));
        oos1.writeObject(s5);
        oos1.writeObject(s6);
        oos1.writeObject(s7);
        oos1.writeObject(s8);
        oos1.flush();
        oos1.close();
        ObjectOutputStream oos2 = new ObjectOutputStream (new FileOutputStream("G3"));
        oos2.writeObject(s9);
        oos2.writeObject(s10);
        oos2.writeObject(s11);
        oos2.writeObject(s12);
        oos2.flush();
        oos2.close();
        ObjectInputStream ois = new ObjectInputStream (new FileInputStream("G1"));
        Student c1_New = (Student) ois.readObject();
        Student c2_New = (Student) ois.readObject();
        ois.close();
        System.out.println(c2_New);














      /*  ObjectInputStream ois = new ObjectInputStream (new FileInputStream("G1"));
        ArrayList c1_New = (ArrayList) ois.readObject();
        //Student c2_New = (Student)ois.readObject();
        ois.close();
        System.out.println(c1_New);
*/



/*

        PrintWriter pw = new PrintWriter(new FileWriter("G1.txt"));
        for (int j = 0; j <g1.size() ; j++) {
            pw.println(g1.get(j));
        }
        pw.flush();
        pw.close();


        BufferedReader br = new BufferedReader(new FileReader("G1.txt"));
        ArrayList <String> fromFile = new ArrayList ();
        String s = "";
        while ((s = br.readLine()) != null){

            fromFile.add(s.toUpperCase());
        }

        Collections.sort(fromFile);
        for (int i = 0; i <fromFile.size() ; i++) {
            System.out.println(fromFile.get(i));
        }

*/



    }
}
