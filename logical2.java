import java.util.Scanner;

public class logical2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a::");
        int a=scan.nextInt();
        System.out.println("enter b::");
        int b=scan.nextInt();
        System.out.println("enter c::");
        int c=scan.nextInt();
        if (a>b && a>c){
            System.out.println("a is first greater number");
            if (b<a && b>c){
                System.out.println("b is second greater number");
                System.out.println("c is smaller number");
                
            }else{
                System.out.println("c is second greater number");
                System.out.println("b is smaller number");
            }
    }else if(b>a &&b>c){
            System.out.println("b i first greater number");
            if (a<b && a>c){
                System.out.println("a is second greater number");
                System.out.println("c is smaller number");
            }else{
                System.out.println("c is second greater number");
                System.out.println("a is smaller number");
            }
        }else{
            System.out.println("c is first greater number");
            if(b>a && b<c){
                System.out.println("b is second greater number");
                System.out.println("a is smaller number");
            }else{
                System.out.println("a is second greater number");
                System.out.println("b is smaller number");
            }
        }

        scan.close();
    }
}
