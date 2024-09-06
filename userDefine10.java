import java.util.Scanner;

public class userDefine10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        hallowSquare(n);
        hallowTriangle(n);
        Diamond(n);
        scan.close();
    }
    public static void hallowSquare(int n) {
        System.out.println("Hallow Square::");
        System.out.println(" ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 ||i==n ||j==n){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }System.out.println(" ");
    }
    public static void hallowTriangle(int n) {
        System.out.println("Hallow Triangle::");
        System.out.println(" ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=9;j++){
                if(i+j==6 || j-i==4 ||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void Diamond(int n) {
        System.out.println("Diamond::");
        System.out.println(" ");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    for(int i=n;i>=1;i--){
        for(int j=n;j>=i;j--){
            System.out.print(j);
        }
        for(int j=i;j>1;j--){
            System.out.print(" ");
        }
        for(int j=i;j>1;j--){
            System.out.print(" ");
        }
        for(int j=i;j<=n;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    
    }
}
