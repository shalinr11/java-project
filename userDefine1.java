import java.util.Scanner;

public class userDefine1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a::");
        int a=scan.nextInt();
        System.out.println("Enter b::");
        int b=scan.nextInt();
        add(a, b);
        sub(a,b);
        multiply(a,b);
        divide(a,b);
        modulus(a,b);

        scan.close();
    }
    public static void add(int a,int b){
        int sol=a+b;
        System.out.println("sum="+sol);
    }
    public static void sub(int a,int b) {
        int sol=a-b;
        System.out.println("sub="+sol);
    }
    public static void multiply(int a,int b) {
        int sol=a*b;
        System.out.println("multiply="+sol);
    }
    public static void divide(int a,int b) {
        int sol=a/b;
        System.out.println("divide="+sol);
    }
    public static void modulus(int a,int b) {
        int sol=a%b;
        System.out.println("modulus="+sol);
    }

    
}
