import java.util.Scanner;

public class new4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter number::");
        int a=scan.nextInt();
        if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        scan.close();
    }
}
