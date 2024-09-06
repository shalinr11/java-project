import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the gender");
        String gender = scan.nextLine();

        if(gender.equals("male")){
            System.out.println("male");
            System.out.println("enter age ::");
            int age= scan.nextInt();
            if(age>20){
                System.out.println("eligible to admission");
                int mark=scan.nextInt();
                if (mark>70){
                    System.out.println("50% fees discount");
                }else if(mark>50){
                    System.out.println("25% fees discount");
                }else{
                    System.out.println("no discount");
                }
            }
            else{
                System.out.println("not eligible to admission");
            }
        }else if(gender.equals("female")){
            System.out.println("female");
            System.out.println("enter your age ::");
            int age= scan.nextInt();
            if(age>18){
                System.out.println("eligible to admission");
                int mark=scan.nextInt();
                if (mark>75){
                    System.out.println("50% fees discount");
                }else if (mark>65){
                    System.out.println("25% fees discount");
                }else{
                    System.out.println("no discount");
                }
            }
            else{
                System.out.println("not eligible to admission");
            }
        }else{
            System.out.println("invalid gender");
        }
       scan.close();
    }
}
