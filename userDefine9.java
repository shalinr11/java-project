public class userDefine9 {
    public static void main(String[] args) {
        int n=5;
        hallowDiamond(n);
    }
    public static void hallowDiamond(int n) {
        System.out.println("Hallow Diamond::");
        System.out.println(" ");
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=9;j++){
                if(i+j==6 || j-i==4 ){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=9;j++){
                if(i+j==6 || j-i==4){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
