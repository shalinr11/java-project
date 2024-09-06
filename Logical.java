import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number ::");
        int num = scan.nextInt();
        System.out.println("Enter character::");
        char alp = scan.next().charAt(0);
        if(alp =='a'|| alp == 'e'||alp=='i'|| alp=='o'||alp=='u'){
            System.out.println("vowels");
        }else{
             System.out.println("not a vowels");
        }
        
        if(num>50 && num<100){
            System.out.println("in range");
        }
        else{
            System.out.println("out of range");
        }
        
        // boolean fan_status = scan.nextBoolean();//for not operator
        // if(!fan_status){
        //     System.out.println("fan is off");
        // }else{
        //     System.out.println("fan is on");
        // }

        scan.close();
    }
}
