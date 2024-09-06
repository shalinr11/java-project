public class forloop1 {
    public static void main(String[] args) {
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }

        System.out.println("-----------------");
        int a=0;
        for(int j=1;j<=10;j++){
            a=a+j;
        }System.out.println("total number="+a);

        System.out.println("------------------");

        int b=0;
        int c=0;
        for(int k=1;k<=10;k++){
            if (k%2==0) {
                b=b+k;
            }else if (k%2!=0) {
                c=c+k;
            }
        }System.out.println("even add="+b);
        System.out.println("odd add="+c);
    }
}
