import java.util.Scanner;

public class operator1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=((a*a*a)+(3*(a*a)*b)+(3*(b*b)*a)+(b*b*b))/((a*a)+(b*b));
        System.out.println(c);

        scan.close();
    }
}
