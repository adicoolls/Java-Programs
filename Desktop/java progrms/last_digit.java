public class last_digit {
    public static void main(String[] args) {
        int n = 123;
        int i = n%10;
        int m = (n/10)%10;
        int j = (n/100);

        System.out.println("the last digit of the number is"+i);
        System.out.println("the second last digit of the number is "+m);
        System.out.println("the first digit of the number is"+j);
    }
}
