import java.util.*;
public class A1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String arr[] = sc.nextLine().split(" ");
        boolean res = false;
        for(String item : arr){
            if(item.equals("1")){
                res = true;
                break;
            }
        }
        
        System.out.println(res?"HARD":"EASY");
    }
}
