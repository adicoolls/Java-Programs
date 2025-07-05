public class newclg7 {

 void run(){
    System.out.println("vehicle is running");

 }
 class bike extends newclg7{
    void run(){
        System.out.println("bike is running");
    }
    public static void main(String[] args) {
        bike obj = new bike();  
        obj.run();
    }
 }


    //method overriding
    //if a subclass provides the specific implementation of the method that has been declared by one of its parent class then it is called method overriding

    

}
