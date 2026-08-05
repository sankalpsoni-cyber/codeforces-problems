import java.util.Scanner;
public class A791 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int lim = sc.nextInt();
       int bob = sc.nextInt();
       int count = 0;
       while(lim <= bob){
        lim*=3;
        bob*=2;
        count++;
       }
       System.out.println(count);
   } 
}
