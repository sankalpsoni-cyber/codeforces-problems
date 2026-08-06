import java.util.Scanner;

public class A510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Tracks whether the '#' should be on the right side
        boolean rightHash = true; 
        
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            
            if (i % 2 == 1) {
                // Odd rows are always completely filled with '#'
                for (int j = 0; j < m; j++) {
                    row.append('#');
                }
            } else {
                // Even rows alternate the position of '#'
                for (int j = 0; j < m; j++) {
                    if (rightHash && j == m - 1) {
                        row.append('#');
                    } else if (!rightHash && j == 0) {
                        row.append('#');
                    } else {
                        row.append('.');
                    }
                }
                // Toggle the direction for the next even row
                rightHash = !rightHash; 
            }
            System.out.println(row.toString());
        }
        sc.close();
    }
}