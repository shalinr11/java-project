public class userDefine2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int b=0;
        arr(a,b);
    }
    public static void arr(int a[],int b) {
        for(int i=0;i<a.length;i++){
            b+=a[i];
        }System.out.println("sum="+b);
    }
}
