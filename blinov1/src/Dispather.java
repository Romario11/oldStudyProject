/**
 * Created by nAz on 11/28/2015.
 */
public class Dispather {
    public static void main(String[] args) {
        String[] s= {"serg","ann","bohdan"};
        StringBuilder sNew = new StringBuilder(s[0]);
        sNew.setCharAt(3,'a');
        //System.out.println(sNew);
        StringBuilder sb = new StringBuilder("");
        //for (String temp:s){
        for (int i = 0;i<s.length;i++){
            if(s[i].length()>3){
                sb = new StringBuilder(s[i]);
                sb.setCharAt(3,'a');
                s[i]=sb.toString();
            }
        }
        for (String tempArr:s) {
            System.out.println(tempArr);
        }

    }
}
