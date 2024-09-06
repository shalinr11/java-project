import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        // System.out.println("enter number=");
        // int a=scan.nextInt();
        // while (a!=0){
        //     a=scan.nextInt();
        // }

        System.out.println("Enter::");
        String a=scan.next();
        while (!a.equals("stop")) {
            a=scan.next();
        }
        scan.close();
    }
}
