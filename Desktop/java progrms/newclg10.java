public class newclg10 {
    //FINAL KEYWORD
    //in java final keyword is used to apply restrications on classes, methods, and variables. The usage of final depends on where it is applied:
    //1) final variables = when a variables is declared as 'final', its value cannot be changed once it has been assigned. this makes the variable a constant.
    //final int max_value = 100;

    //2)final method = a method declared as final cannot be overridden by subclasses. this is useful when you want to ensure that the behavior of the method remains consistent across all subclasses.

    /*
     * public final void display(){
     * system.out.println("this is final method")
     * 
     * }
     */

     // final classes = a class declared as final cannot be subclassed. this is useful when you want to prevent inheritance and ensure that the class cannot be extended.

     /*
      * public final class FinalClass {
    // class body
}

      */

    //EXAMPLE OF FINAL KEYWORD
    /*
     * final class finalclassexample{
     * final int maxvalue = 100;
     * 
     * final void display(){
     * system.out.println("this is a final method");
     * }
     * void show(){
     * system.out.println("max value" + maxvalue) ;
     * }
     * }
     * public class testfinal{
     * public static void main(String []args){
     * finalclassexample example = new finalclassexample();
     * example.display();
     * example.show();
     * }
     * }
     */

      
}
