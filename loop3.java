import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter number::");
        int n=scan.nextInt();
        int i=1;
        int a=1;
        while (i<=n*n){
            System.out.print(a+" ");
            if (i%n==0) {
                System.out.println( );
                a++;
            }i++;  
        }

        // reverse square
        // int n=scan.nextInt();
        // int i=1;
        // int a=n;
        // while (i<=n*n) {
        //     System.out.print(a+" ");
        //     if (i%n==0) {
        //         System.out.println();
        //         a--;
        //     }i++;
        // }

        scan.close();
  }
 }
