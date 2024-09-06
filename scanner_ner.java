import java.util.Scanner;
public class scanner_ner{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Byte a=scan.nextByte();
        Short b=scan.nextShort();
        int c= scan.nextInt();
        long d=scan.nextLong();
        float e=scan.nextFloat();
        double f=scan.nextDouble();
        Boolean g=scan.nextBoolean();
        String h=scan.next();
        char i=scan.next().charAt(0);
        System.out.println("byte="+a);
        System.out.println("short="+b);
        System.out.println("int="+c);
        System.out.println("long="+d);
        System.out.println("float="+e);
        System.out.println("double="+f);
        System.out.println("boolen="+g);
        System.out.println("string="+h);
        System.out.println("char="+i);
scan.close();

    } 
        
} 
    

