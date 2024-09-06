import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        char c=scan.next().charAt(0);

        switch (c) {
            case '+': System.out.println("add="+(a+b));
            break;
            case '-': System.out.println("sub="+(a-b));
            break;
            case '*': System.out.println("multiply="+(a*b));
            break;
            case '/': System.out.println("divide="+(a/b));
            break;
            case '%': System.out.println("modules="+(a%b));
            break;
        
            default:System.out.println("No result");
                break;
        }scan.close();
    }
}
