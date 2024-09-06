import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number::");
        int num=scan.nextInt();
        if (num%2==0) {
            int i=1;
        while (i<=10) {
            System.out.println(num+" * "+i+"  =  "+num*i);
            i++;
        }
        }else{
            int i=10;
            while (i>=1) {
                System.out.println(num+" * "+i+"  =  "+num*i);
                i--;
            } 
        }scan.close();

    }
}
