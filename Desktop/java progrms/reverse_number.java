//reverse the number using recursion 1234 = 4321
public class reverse_number {
   static int  reverse(int n , int rev){
    if(n == 0)return rev;

    return  reverse( n / 10, rev*10 + n % 10);


   } 
   public static void main(String[] args) {
    int x = 1234;
    int result = reverse(x, 0);
    System.out.println(result);
   }
}
