public class stringFunction2 {
    public static void main(String[] args) {
        String a="the biggest risk is not taking any risk ";
       String b="";
       String [] a1=a.split(b);
       for(int i=0;i<=a1.length-1;i++){
          if(i%2==0){
            b+=a1[i].toUpperCase();
          }else{
            b+=a1[i].toLowerCase();
          }
    //    String n=a1[i].substring(0,1);
    //    String m=a1[i].substring(1);
    //    System.out.println(n.toUpperCase()+m.toLowerCase());
       }
       System.out.println(b);
    }
}
