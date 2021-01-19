import java.util.*;
class HeartRate {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int n=kbd.nextInt();
     for(int i=0; i<n;i++){
       double b=kbd.nextDouble();
       double p=kbd.nextDouble();
       double bp = (60*b/p);
       double ambp = 60/p;
       double min = bp+ambp;
       // System.out.print(p-ambp+" "+bp+" "+min);
       System.out.format("%.4f%n", bp-ambp);
       System.out.format("%.4f%n", bp);     
       System.out.format("%.4f%n", min);     
     }    
  }
}