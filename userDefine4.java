import java.util.Scanner;

public class userDefine4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter value::");
        int a[]={23,45,2,4,1,66,7,27,98};
        int b=scan.nextInt();
        String n="absent";
        arr(a, b , n);

        scan.close();
    }
    public static void arr(int a[],int b,String n) {
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                n="present";
            }
            
        }System.out.println(n);
    }
}
