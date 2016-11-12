import java.io.Serializable;

/**
 * Created by ROMARIO on 17.12.2015.
 */
public class Student implements Serializable {
    String name;
    double mark;

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
