//need to return the sum of n numbers using recursion
public class sum_of_first_n_numbers {
    static int sumofn( int n){
      if(n == 1){
        return 1;
      }
      return n + sumofn(n-1);
    }
    public static void main(String[] args) {
        int x = 5;
        int result = sumofn(x);
        System.out.println(result);
    }
}
