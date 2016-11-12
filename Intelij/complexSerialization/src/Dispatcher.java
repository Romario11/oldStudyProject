import java.io.*;
import java.util.ArrayList;

/**
 * Created by nAz on 12/20/2015.
 */
public class Dispatcher {
    public static void main(String[] args)throws Exception {
        File file1 = new File("file1");
        Musician john = new Musician("John","Piano");
        Musician jack = new Musician("Jack","Guitar");
        Musician mary = new Musician("Mary","Vokal");
        ArrayList<Musician> m = new ArrayList<Musician>();
        m.add(john);
        m.add(jack);
        m.add(mary);

       // Musician [] m={john,jack,mary};
        //Orchestra orchestra = new Orchestra(m.length,m,"Lviv","Ghay");
        Orchestra orchestra = new Orchestra(m.size(),m,"Lviv","Ghay");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file1"));
        oos.writeObject(orchestra);
        oos.flush();
        oos.close();
        Orchestra.town="ivano-Fran";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file1"));
        Orchestra new_Or = (Orchestra)ois.readObject();
        ois.close();
        for (Musician temp: new_Or.m) {
            System.out.println(temp.name+" "+temp.instrument );
        }
        System.out.println(new_Or.tawnCopy);

    }
}
