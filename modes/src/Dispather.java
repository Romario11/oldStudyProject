/**
 * Created by nAz on 12/5/2015.
 */
public class Dispather {
    public static void main(String[] args) {

        int x = 349;
        int y =0b101011101;
        int t = 0x15d;
        int a = 0535;
        System.out.println(x);
        System.out.println(y);
        System.out.println(t);
        System.out.println(a);
        int z = y*22;
        System.out.println(z);
        int temp1 = y <<1 ;  //y*2
        int temp2 = temp1 <<1 ;// y* 4
        int temp3 = temp2 <<2 ; // y*16
        System.out.println(temp1+temp2+temp3);
        byte l= 12;
        byte k= 40;
        l+=k;
        //short d=l+k;


    }
}
