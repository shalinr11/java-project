import java.util.Scanner;

public class userDefine11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char board[]={'-','-','-','-','-','-','-','-','-'};
        // int b=scan.nextInt();
        // display(board,b);
        char a=scan.next().charAt(0);
        char a1=player(a);
        System.out.println(a1);
        scan.close();

        
    }
        public static void display(char board[],int b) {
        for(int i=0;i<b;i++){
                for(int j=0;j<b;j++){
                    System.out.print(board[i]+" ");
                }System.out.println( );
        }
    }
        public static char player(char a) {
            if(a=='x'){
                a='o';
            }else{
                a='x';
            }
            return a;
    }
}
