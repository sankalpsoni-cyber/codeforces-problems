import java.util.Scanner;

public class A734 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String game = sc.next();
        int anton = 0;
        int danik = 0;
        for(int i = 0;i < n;i++){
            if(game.charAt(i) == 'A'){
                anton++;
            }else{
                danik++;
            }
        }
        if(anton > danik){
            System.out.println("Anton");
        }else if(danik > anton){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
