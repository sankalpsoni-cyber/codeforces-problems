import java.util.Scanner;

public class A467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int availableRoomsCount = 0;
        for (int i = 0; i < n; i++) {
            int currentPeople = scanner.nextInt();
            int totalCapacity = scanner.nextInt();
            if (totalCapacity - currentPeople >= 2) {
                availableRoomsCount++;
            }
        }
        System.out.println(availableRoomsCount);
    }
}