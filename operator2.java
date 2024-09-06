import java.util.Scanner;

public class operator2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // int a=scan.nextInt();
        // int c1=a*a;
        // System.out.println("Area of square="+c1);
        // int c2=4*a;
        // System.out.println("Perimeter of square="+c2);

        // int r=scan.nextInt();
        // float pi=3.14f;
        // float n1=pi+(r*r);
        // System.out.println("Area of circle="+n1);
        // float n2=2*pi*r;
        // System.out.println("Perimeter of circle="+n2);

        // int l=scan.nextInt();
        // int b=scan.nextInt();
        // int w=scan.nextInt();
        // int d1=l*b;
        // System.out.println("Area of rectangle="+d1);
        // int d2=2*(l+w);
        // System.out.println("perimeter of rectangle="+d2);

        int a1=scan.nextInt();
        int b1=scan.nextInt();
        int c=scan.nextInt();
        int h=scan.nextInt();
        float s1=(1/2)*b1*h;
        System.out.println("Area of triangle="+s1);
        int s2=a1+b1+c;
        System.out.println("Perimeter of triangle="+s2);

        scan.close();
    }
}
