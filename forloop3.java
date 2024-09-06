import java.util.Scanner;

public class forloop3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        for(int i=1;i<=a*a;i++){
            System.out.print(" * ");
            if(i%a==0){
                System.out.println();
            }

        }


        // int a=1;
        // for(int i=1;i<=num*num;i++){
        //     System.out.print(a+" ");
        //     if(i%num==0){
        //         System.out.println( );
        //         a++;
        //     }
        // }

        scan.close();
    }
}
