public class count_number_of_digits {
    static int count(int n){
        if(n == 0)return 0;
        return 1 + count(n/10);
    }
    public static void main(String[] args) {
        int x = 1234;
        int result = count(x);

        System.out.println(result);
    }
}
