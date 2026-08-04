import java.util.Scanner;
public class A281 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] ch = word.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
    }
}
