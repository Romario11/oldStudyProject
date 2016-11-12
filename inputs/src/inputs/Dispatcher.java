package inputs;
import java.io.*;
import java.util.*;

public class Dispatcher {

	public static void main(String[] args) throws IOException {
		File f2 = new File ("f2");
		FileWriter fw = new FileWriter(f2, true);
		PrintWriter pw = new PrintWriter (fw);
		pw.println("Ann     4,89");
		pw.println("Bella   4,98");
		pw.println("Slavko  4,83");
		pw.flush();
		pw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(f2));
		ArrayList <String> fromFile = new ArrayList ();
		String s = "";
		while ((s = br.readLine()) != null){
			fromFile.add(s);
		}
		
		Collections.sort(fromFile);
		
		System.out.println(fromFile);
		
	}
}