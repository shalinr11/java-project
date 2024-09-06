import java.util.Scanner;

public class mathFunction1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter a::");
        int a=scan.nextInt();
        System.out.println("Enter b::");
        int b=scan.nextInt();
        System.out.println("max number="+Math.max(a,b));
        System.out.println("min number="+Math.min(a,b));

        scan.close();
    }
}
