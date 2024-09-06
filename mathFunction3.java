import java.util.Scanner;

public class mathFunction3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        String a[]={"stone","paper","scissor"};
        int a1=scan.nextInt();
        int b=a.length;
        int a2=(int)(Math.random()*b);
        System.out.println("user="+a[a1]);
        System.out.println("computer="+a[a2]);
        if(a[a1]=="stone" && a[a2]!="stone"){
            if(a[a2]=="scissor"){
                System.out.println("user wins");
            }else{
                System.out.println("computer wins");
            }
        }else if(a[a1]=="paper" && a[a2]!="paper"){
            if(a[a2]=="stone"){
                System.out.println("user wins");
            }else {
                System.out.println("computer wins");
            }
        }else if(a[a1]=="scissor" && a[a2]!="scissor"){
            if(a[a2]=="papper"){
                System.out.println("user wins");
            }else{
                System.out.println("computer wins");
            }
        }else{
            System.out.println("draw");
        }
        scan.close();
    }
}
