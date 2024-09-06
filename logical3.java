import java.util.Scanner;

public class logical3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter gender::");
        String gender = scan.next();

        if (gender.equals("male")) {
            System.out.println("Enter age::");
            int age = scan.nextInt();
            if (age >= 12 && age <= 18) {
                System.out.println("Enter blood level::");
                float bl = scan.nextFloat();
                if (bl >= 13.0 && bl <= 16.0) {
                    System.out.println("normal");
                } else {
                    System.out.println("not normal");
                }
            } else if (age>18 && age<=60) {
                System.out.println("Enter blood level::");
                float bl = scan.nextFloat();
                if (bl >= 13.6 && bl <= 17.7) {
                    System.out.println("normal");
                } else {
                    System.out.println("not normal");
                }
            }else{
                System.out.println("age is not match");
            }
        }
        

        else if (gender.equals("female")) {
            System.out.println("Enter age::");
            int age = scan.nextInt();
            if (age >= 12 && age <= 18) {
                 System.out.println("Enter blood level::");
                float bl = scan.nextFloat();
                if (bl >= 12.0 && bl <= 16.0) {
                    System.out.println("normal");
                } else {
        System.out.println("not normal");
        }
        } else if (age>18 && age<=60) {
        System.out.println("Enter blood level::");
        float bl = scan.nextFloat();
        if (bl >= 12.1 && bl <= 15.1) {
        System.out.println("normal");
        } else {
        System.out.println("not normal");
        }
        }else{
            System.out.println("age not match");
        }
    }
        else if (gender.equals("children")) {
            System.out.println("Enter age::");
            int age = scan.nextInt();
            if (age >= 2 && age <= 6) {
                System.out.println("Enter blood level::");
                float bl = scan.nextFloat();
                if (bl >= 11.5 && bl <= 13.5) {
                    System.out.println("normal");
                } else {
                    System.out.println("not normal");
                }
        } else if (age >= 6 && age <= 12) {
        System.out.println("Enter blood level::");
        float bl = scan.nextFloat();
        if (bl >= 11.5 && bl <= 15.5) {
        System.out.println("normal");
        } else {
        System.out.println("not normal");
        }
    }else{
        System.out.println("age not match");
    }
}       else{
    System.out.println("Gender not match");
}

scan.close();
    }

}
