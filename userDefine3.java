public class userDefine3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int b=0;
        int c=0;
        arr(a,b,c);
    }
    public static void arr(int a[],int b,int c) {
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                b+=a[i];
            }else{
                c+=a[i];
            }
        }System.out.println("sum of even number="+b);
        System.out.println("sum of odd number="+c);
    }
}
