import java.util.Scanner;

public class nestedloop4 {
    public static void main(String[] args) {
        Scanner scan=new  Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");                 //output::
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);               //       1
            }                                      //      212
            for(int j=2;j<=i;j++){                 //     32123
                System.out.print(j);              //     4321234
            }System.out.println();                //    543212345
        }                                        //      4321234
                                                //        32123
        for(int i=n-1;i>=1;i--){                  //       212
        for(int j=n;j>=i;j--){                //            1
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
    scan.close();
    }
}


