import java.io.Serializable;

/**
 * Created by nAz on 12/20/2015.
 */
public class Dog extends Animal implements Serializable {
    static int field;
    int fieldCopy;
    int price;
    int myweigth;

    public Dog(int weight, int price,int f) {
        super(weight);
        this.price = price;
        this.myweigth=weight;
        field= f;

    }
}
