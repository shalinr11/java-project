import java.util.Arrays;
public class arrayFunction1 {
    public static void main(String[] args) {
         // Get the Arrays 
         int a[] = { 10, 20, 15, 22, 35 }; 
         Arrays.sort(a);
         int b=a.length;
         int c[]=new int[b];
         int j=0;
         for(int i=b-1;i>=0;i--){
            c[j]=a[i];
            j++;
         }
         System.out.println(Arrays.toString(a));
         System.out.println(Arrays.toString(c));
         
         

    }
}
