import java.util.Scanner;

public  class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a1=scan.next();
        String b1=scan.next();
        String c1= scan.next();
        String a2=scan.next();
        byte b2=scan.nextByte();
        int c2=scan.nextInt();
        String a3=scan.next();
        byte b3=scan.nextByte();
        int c3=scan.nextInt();
        String a4=scan.next();
        byte b4=scan.nextByte();
        int c4=scan.nextInt();
        String a5=scan.next();
        byte b5=scan.nextByte();
        int c5=scan.nextInt();
        String a6=scan.next();
        byte b6=scan.nextByte();
        int c6=scan.nextInt();
        System.out.println("|"+a1+" |"+b1+"|"+c1+"|");
        System.out.println("|"+a2+"     |    "+b2+"   |  "+c2+" |");
        System.out.println("|"+a3+" |    "+b3+"   |  "+c3+" |");
        System.out.println("|"+a4+"     |    "+b4+"   |  "+c4+" |");
        System.out.println("|"+a5+"  |    "+b5+"   |  "+c5+" |");
        System.out.println("|"+a6+"  |    "+b6+"   |  "+c6+" |");

        scan.close();
    }
}
