public class array2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int b=0;
        b=a[0];
        a[0]=a[9];
        a[9]=b;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println(a[6]);
        System.out.println(a[7]);
        System.out.println(a[8]);
        System.out.println(a[9]);
    }
}
