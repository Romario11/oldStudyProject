import java.io.*;
import java.util.ArrayList;

/**
 * Created by nAz on 12/20/2015.
 */
public class Orchestra extends Group implements Serializable {
    static String town;
    String name;
   transient ArrayList <Musician> m;
    int count;
    String tawnCopy;
    //transient  Musician [] m;


   // public Orchestra(int count, Musician[] m,String town,String name) {
   public Orchestra(int count, ArrayList<Musician> m,String town,String name) {
        super(count);
        this.m = m;
        this.town=town;
        this.name=name;
       this.count=m.size();
    }
    private void writeObject (ObjectOutputStream os) throws IOException {
        tawnCopy=Orchestra.town;
        os.defaultWriteObject();
       // os.writeInt(m.length);
        for (Musician temp: m) {
            os.writeObject(temp.name);
            os.writeObject(temp.instrument);
        }


    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {

        is.defaultReadObject();
        //m= new Musician[is.readInt()];
        m = new ArrayList<Musician>();
        //for (int i = 0; i <m.length ; i++) {
        for (int i = 0; i <count ; i++) {
          //  m[i]= new Musician((String)is.readObject(),(String)is.readObject());
           Musician m_new = new Musician((String)is.readObject(),(String)is.readObject());
            m.add(m_new);

        }


    }
}
