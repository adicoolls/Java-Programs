public class college9b {

    public void odd(){
        for(int i= 0; i<=100; i++){
            
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("the odd numbers from 1 to 100 is " + "\n");
        college9b obj = new college9b();
        obj.odd();
    }
    
}
