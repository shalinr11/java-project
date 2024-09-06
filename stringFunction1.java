public class stringFunction1 {
    public static void main(String[] args) {
       String a="the biggest risk is not taking any risk ";
       String b=" ";
       String [] a1=a.split(b);
    //    int last=a1.length-1;
    //    System.out.println(a1[last].length());

    for(int i=0;i<=a1.length-1;i++){
        if(i%2!=0){
            System.out.println(a1[i].toUpperCase());
        }else{
            System.out.println(a1[i].toLowerCase());
        }
    }

    }
}
