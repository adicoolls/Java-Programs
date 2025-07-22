
//Java try-catch block
//java try block is used to enclose the code that might throw an exception. it must be used within the method.
//if an exception occurs at the particular statement the try block, the rest of the block code will not execute.so it is recommended not to keep the code in try block that will not throw an exception
//now will see the problem without exception handling
/*
 * public class TryCatchExample1 {  
  
    public static void main(String[] args) {  
          
        int data=50/0; //may throw exception   
          
        System.out.println("rest of the code");  
          
    }  
      
}  
    as displayed in the above example , the rest of the code is not executed 
    there might be 100 lines of code after the exception. if the exception is not handled , all the code below the exception will be executed.
 */
public class EH2 {
    public static void main(String[] args) {
        try{
            int data = 30/0;

        }
        //handling the exception
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("the rest of the code");
    }
    
}
//butl if the part of the rest of the code is written in the try block , the rest of the code will not be executed
//if the exception is handled , the rest of the code will be executed
