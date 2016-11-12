import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by ROMARIO on 23.12.2015.
 */

public class Controller {

    public static void main(String[] args) throws IOException {
        EmployeeFixedPayment roman =  new EmployeeFixedPayment(69,"roman");
        System.out.println(roman);

        EmployeeAverageMonthlySalary e55 = new EmployeeAverageMonthlySalary(54,"fff",32.56);

        System.out.println(e55);
        File rs = new File("rom.jpg");
        rs.createNewFile();
        Scanner s = new Scanner(rs.getName());
        String test =  s.useDelimiter("\\w*\\.").next();
        System.out.println(test);

        System.out.println(rs.getName());


    }

}
