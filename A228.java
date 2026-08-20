import java.util.HashSet;
import java.util.Scanner;

public class A228 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        HashSet<Integer> color = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            color.add(sc.nextInt());
        }
        int shoes = 4 - color.size();
        
        System.out.println(shoes);
    }
}
