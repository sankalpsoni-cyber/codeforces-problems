
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        int maxScore = scores[0];
        int minScore = scores[0];
        int remarkableCount = 0;
        
        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore) {
                remarkableCount++;
                maxScore = scores[i];
            } else if (scores[i] < minScore) {
                remarkableCount++;
                minScore = scores[i];
            }
        }
        
        System.out.println(remarkableCount);
    }
}
