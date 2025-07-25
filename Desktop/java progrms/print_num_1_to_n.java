// return the numbers from 1 to n ;
public class print_num_1_to_n {
    void num(int n){
        if(n == 0)return;

        num(n - 1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int x = 5;
        print_num_1_to_n obj = new print_num_1_to_n();
        obj.num(x);
    }
}
