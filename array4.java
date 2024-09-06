public class array4 {
    public static void main(String[] args) {
       int a[]={1,2,3,4,4,8,2,6};
       int b=((a.length)/2)+1;
       int i=1;
       while (i<b) {
        System.out.println(i);
        System.out.println(i+((a.length)/2));
        i++;
       }
    }
}
