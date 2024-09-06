import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        if(a>=18){
            System.out.println("major");
        }else{
            System.out.println("minor");
        }scan.close();
    }
}
