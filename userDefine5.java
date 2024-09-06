import java.util.Scanner;

public class userDefine5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a[]={11,32,13,14,3,4,5,6,7,1,2,8,15,26,17,18,75,20};
        System.out.println("Enter value::");
        int b=scan.nextInt();
        int c=0;
        arr(a, b, c);
        scan.close();
    }
    public static void arr(int a[],int b,int c) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==b ){
                    System.out.println("num1="+a[i]+"  "+"num2="+a[j]);
                }
            }
        }
    }
}
