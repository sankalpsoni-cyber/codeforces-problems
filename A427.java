import java.util.Scanner;
public class A427 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0; //available
        int b = 0; //untreated
        for(int i=0;i<n;i++){
            int event = sc.nextInt();
            if(event == -1){
                if(a > 0){
                    a--;
                }else{
                    b++;
                }
            }else{
                a += event;
            }
        }
        System.out.print(b);
    }
}
