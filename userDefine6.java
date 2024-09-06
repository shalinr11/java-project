public class userDefine6 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        // int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        arr(a);
        // rightRoateMatrix(a);
        // leftRotateMatrix(a);
        // addMatrix(a,b);
        // multipleMatrix(a, b);
    }
    public static void arr(int a[][]) {
        System.out.println("Straight matrix::");
        for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }System.out.println( );
            }System.out.println("----------------------");
    }
    
    // public static void rightRoateMatrix(int a[][]) {
    //     System.out.println("Rigth rotate matrix::");
    //     for(int i=0;i<a.length;i++){
    //             for(int j=a[i].length-1;j>=0;j--){
    //                 System.out.print(a[j][i]+" ");
    //             }System.out.println( );
    //         }System.out.println("-----------------------");
    // }
    // public static void leftRotateMatrix(int a[][]) {
    //     System.out.println("Left rotate matrix::");
    //     for(int i=a.length-1;i>=0;i--){
    //         for(int j=0;j<a[i].length;j++){
    //             System.out.print(a[j][i]+" ");
    //         }System.out.println( );
    //     }
    // }
    // public static void addMatrix(int a[][],int b[][]) {
    //     System.out.println("Add matrix::");
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a[i].length;j++){
    //             int n=a[i][j];
    //             int m=b[i][j];
    //             System.out.print((n+m)+"   ");
    //         }System.out.println();
    //     }System.out.println("-------------------");
    // }
    // public static void multipleMatrix(int a[][],int b[][]) {
    //     System.out.println("Multiple matrix::");
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a[i].length;j++){
    //             int n=a[i][j];
    //             int m=b[i][j];
    //             System.out.print((n*m)+"   ");
    //         }System.out.println();
    //     } 
    // }
}
