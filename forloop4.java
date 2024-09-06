public class forloop4 {
    public static void main(String[] args) { 

    int a[]={31,32,33,34,35,36,37,83,93,40};
    int b=(a.length)/2;

    for(int i=b-1;i>=0;i--){
        int n=a[i];
        a[i]=a[i+b];
        a[i+b]=n;
        System.out.println(a[i]+"        "+a[i+b]);
    }
   
        


        
        for(int i=0;i<b;i++){    
            int n=a[i];
            a[i]=a[i+b];
            a[i+b]=n;
        }for(int j=9;j>=0;j--){
            System.out.println(a[j]);
        }


    }
}
