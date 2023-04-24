//inverted star patter using numbers
import java.util.*;

public class pattern_advance {
    
    public static void print(int n){
        for(int i=0; i<n;i++){
            for (int j = 1;j <=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
