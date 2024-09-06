public class userDefine7 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{10,20,30},{40,50,60},{70,80,90}};
        int n[][]=new int [3][3];
        arr(a, b, n);
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length;j++){
                System.out.print(n[i][j]+"  ");
            }System.out.println();
        }
    }
    public static void arr(int a[][],int b[][],int n[][]) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                n[i][j]=a[i][j]+b[i][j];
            }
        }
    }
}
