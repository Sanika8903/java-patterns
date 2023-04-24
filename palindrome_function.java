import java.util.*;

public class palindrome_function {
   
   public static void palindrome(int n){
    int rev = 0;
    int Mynum = n;
    while(n > 0){
        int num = n%10;
        n = n/10;
        rev = rev*10 + num;
   }
   System.out.println(rev);
   if (rev == Mynum){
    System.out.println("No. is a palindrome");
   }
   else{
    System.out.println("No. is not a palindrome");
   }
}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    palindrome(n);
   } 
}
