import java.util.Scanner;

public class switch3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();

        switch (a) {
            case "shalini": 
            System.out.println("Name     =  Shalini R");
            System.out.println("email    = sha902590@gmail.com");
            System.out.println("phone no = 9025900454");
            break;
            case "maha": 
            System.out.println("Name     =  Maha C");
            System.out.println("email    = maha123@gmail.com");
            System.out.println("phone no = 9034865454");
            break;
            case "rithika": 
            System.out.println("Name     =  Rithika V");
            System.out.println("email    = rith454@gmail.com");
            System.out.println("phone no = 7832672390");
            break;
            case "ram": 
            System.out.println("Name     =  Ram kumar V");
            System.out.println("email    = ram112006@gmail.com");
            System.out.println("phone no = 7845675505");
            break;
            case "mageshwari": 
            System.out.println("Name     =  Mageshwari R");
            System.out.println("email    = magesh2009@gmail.com");
            System.out.println("phone no = 9600201012");
            break;
            case "keerthana": 
            System.out.println("Name     =  Keerthana ");
            System.out.println("email    = keerthi09@gmail.com");
            System.out.println("phone no = 9890343876");
            break;
            case "banu": 
            System.out.println("Name     =  Banu priya M");
            System.out.println("email    = banu2006@gmail.com");
            System.out.println("phone no = 7834672065");
            break;
            case "sheeba": 
            System.out.println("Name     =  Sheeba rubal C");
            System.out.println("email    = rubal007@gmail.com");
            System.out.println("phone no = 9478236793");
            break;
            case "amirtha": 
            System.out.println("Name     =  Amirtha R.L");
            System.out.println("email    = amir18@gmail.com");
            System.out.println("phone no = 6389561209");
            break;
            case "sri": 
            System.out.println("Name     =  Jaya sri M");
            System.out.println("emai   l = sri0022@gmail.com");
            System.out.println("phone no = 9112673345");
            break;
        
            default: System.out.println("No Result");
            break;
        }scan.close();
    }
}
