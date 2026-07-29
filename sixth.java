import java.util.HashSet;
import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean loop = true; 
         
        while (loop) {
            year++;
            
            HashSet<Character> hSet = new HashSet<>();
            char[] digits = Integer.toString(year).toCharArray();
            
            for (char digit : digits) {
                if(!hSet.contains(digit))
                {
                    hSet.add(digit);
                }
            }
            
            if (hSet.size() == digits.length) {
                System.out.println(year);
                loop = false;
            }

        }
        
    }
    
}
