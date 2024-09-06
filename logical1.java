import java.util.Scanner;

public class logical1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value::");
        char a=scan.next().charAt(0);
        if(a>='0' && a<='9'){
            System.out.println("It is number");
        }else if (a>='a' && a<='z' || a>='A' && a<='Z') {
            System.out.println("It is alphabet");
        }else{
            System.out.println("It is special character");
        }scan.close();

    }
}
