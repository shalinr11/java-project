public class array5 {
    public static void main(String[] args) {
       
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int b=0;
        int c=0;
        int i=0;
        while (i<10) {
        if(a[i]%2==0){
            b+=a[i];
        }
        else if(a[i]%2!=0){
            c+=a[i];
        }i++;
    }System.out.println("sum of even number="+b);
    System.out.println("sum of odd number"+c);
}
}
