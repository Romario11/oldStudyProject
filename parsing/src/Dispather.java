/**
 * Created by nAz on 12/5/2015.
 */
import java.util.Scanner;
import java.util.regex.*;
public class Dispather {
    public static void main(String[] args) {
        /*
        Pattern p = Pattern.compile("(^|\n)[^ ]+");// first word
        // "(^|\n)[^ ]+"
        Matcher m = p.matcher("Serg Mary\n Ann Ivan\nBohdan Andrew ");
        //System.out.println(m.matches());
       // System.out.println(m.find());
        m.find();
        System.out.println(m.group());
        while (m.find()){
            String temp =m.group();
            System.out.println(temp.substring(1));
            }
*/
        /*
        Pattern p = Pattern.compile("Jon.*?( |$)");// first word
        String s= "Jon Jonatahan Ken Todd Jonatahan";
        Matcher m = p.matcher(s);
        s = m.replaceAll("Eric ");
        System.out.println(s);
*/
        Scanner sc = new Scanner("Serg Mary\n Ann Ivan\n Bohdan Stas");
        //sc.useDelimiter(",=!");
        while (sc.hasNextLine()){
           // String line = sc.nextLine();
           // Scanner sc2= new Scanner(line);
           // System.out.println(sc2.next());
            System.out.println(new Scanner(sc.nextLine()).next());

        }

    }
}
