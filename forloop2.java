public class forloop2 {
    public static void main(String[] args) {
        int a[]={21,22,23,24,25,26,27,28,29,30};
        int b=((a.length)/2);

        for(int i=0;i<b;i++){
            int n=a[i];               //output::26,27,28,29,30,21,22,23,24,25
            a[i]=a[i+b];
            a[i+b]=n;
        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }

        // int a[]={21,22,23,24,25,26,27,28,29,30};
        // int b=a.length/2;
        
        // for(int i=0;i<b;i++){        //output::25,24,23,22,21,30,29,28,27,26
        //     int n=a[i];
        //     a[i]=a[i+b];
        //     a[i+b]=n;
        // }for(int j=9;j>=0;j--){
        //     System.out.println(a[j]);
        // }
    }
}
