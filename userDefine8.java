import java.util.Scanner;

public class userDefine8 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        square(n);
        diamond(n);
        numDiamond(n);
        scan.close();
    }
    public static void square(int n) {
        System.out.println("Square::");
        System.out.println(" ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }System.out.println();
        }System.out.println(" ");
    }
    public static void diamond(int n) {
        System.out.println("Diamond::");
        System.out.println(" ");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print( "*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
          } 
            
            for(int i=1;i<=n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=n-1;j>=i;j--){
                    System.out.print( "*");
                }
                for(int j=n-1;j>=i+1;j--){
                    System.out.print("*");
                }
                System.out.println();
              }System.out.println(" ");
    }
    public static void numDiamond(int n) {

        System.out.println("Number diamond::");
        System.out.println(" ");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");             
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);        
            }                              
            for(int j=2;j<=i;j++){                 
                System.out.print(j);             
            }System.out.println();             
        }                                     
                                            
        for(int i=n-1;i>=1;i--){            
        for(int j=n;j>=i;j--){                
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
