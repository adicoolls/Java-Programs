//exception handling in java is one of the powerful mechnism to handel the runtime error so that the normal flow of the application can be maintained

public class EH1 {
    public static void main(String[] args) {
        try{
            //code that may raise exception
            int data=100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        //rest of the code
        System.out.println("rest of the code");
    }
    
}
