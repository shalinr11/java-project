import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter value::");  
        int a=scan.nextInt();
        int i=1;
        while (i<=a*a) {
            System.out.print(" * ");
            if(i%a==0){
                System.out.println();
            }i++;
        }
        scan.close();
    }
}
