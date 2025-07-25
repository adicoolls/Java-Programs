// return the sum of digits using recursion
public class sum_of_digits {
    static int sum(int n){
     if(n == 1 )return 1;
      return (n % 10) + sum(n / 10);
    }
    public static void main(String[] args) {
        int x = 12345;
        int result = sum(x);
        System.out.println(result);
    }
}
