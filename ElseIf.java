import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
    if(a>=90){
        System.out.println("A grade");
    }else if(a>=80){
        System.out.println("B grade");
    }else if(a>=70){
        System.out.println("C grade");
    }else if(a>=50){
        System.out.println("D grade");
    }else{
        System.out.println("FAIL");
    }
    scan.close();
    }
}
