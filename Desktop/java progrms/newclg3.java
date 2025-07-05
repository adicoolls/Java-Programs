public class newclg3 {
    int acc_no;
    String name;
    float amount;
    //method to initialise object;
    public static void main(String[] args) {
        
    
    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;

    }
    //deposit method
    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt + "deposited");

    }
    //withdraw method
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("sorry insufficient balance");

        }else{
            amount = amount - amt;
            System.out.println(amt + "withdraw");
        }
    }
    //method to check the balance of the account
    void checkbalance(){
        System.out.println("balance is " + amount);
    }
    //method to display the values of an object
    void display(){
        System.out.println(acc_no + " " + name + " " + amount);
    }
    //creating a test class to deposit and withdraw
}
    public class testaccount{
        public static void main(String[] args) {
            newclg3 a1 = new newclg3();
            a1.insert(111, "aditya", 5000);
            a1.checkbalance();
            a1.deposit(5000);
            a1.checkbalance();
            a1.withdraw(3000);
            a1.checkbalance();
            a1.display();
    }
}
}