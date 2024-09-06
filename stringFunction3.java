import java.util.Scanner;

public class stringFunction3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter word::");
        String a=scan.next();
        String b1="";
        String []a1=a.split("");
        for (int i=a1.length-1;i>=0;i--){
          char b=a.charAt(i);
          b1+=b;
        }if(a.equals(b1)){
            System.out.println("it is palindrome word");
        }else{
            System.out.println("it is not palindrome word");
        }
       scan.close();
    }
}
