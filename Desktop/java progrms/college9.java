public class college9 {
    
    static void odd(){
        for(int i = 0; i<=100; i++){
            
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("the odd numbers from 1 to 100 are");
        odd();
    }
}
