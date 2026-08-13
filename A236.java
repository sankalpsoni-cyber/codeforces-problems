import java.util.HashSet;
import java.util.Scanner;
public class A236 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            uniqueChars.add(s.charAt(i));
        }
        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
       
    }
}
