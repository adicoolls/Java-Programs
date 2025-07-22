public class last_digit2 {
    public static void main(String[] args) {
        int n = 1234;
        int i = n % 10;
        int j = (n / 10) % 10;
        int k = (n / 100) % 10;
        int l = (n / 1000) % 10;

        System.out.println("last digit of the number is " + l);
        System.out.println("second last digit of the number is " + k);
        System.out.println("third last digit of the number is " + j);
        System.out.println("the fist digit of the number is " + i);
    }
}
