public class newclg12 {
    //static and the dynamic binding

    //the connecting a method call to the method body is known as binding

    //there are two types of binding
    //1.static binding(also known as early binding)
    //2.dynamic binding (also known as late binding)

    //static binding = when type of the object is determined at compiled time it is known as static binding

    //dynamic binding = when type of the object is determined at runtime it is known as dynamic binding


    //example of static binding
    /*
     * class dog{
     * private void eat(){system.out.println("eating")};
     * 
     * pubilc static void main(string args []){
     * dog d1 = new dog();
     * d1.eat();
     * }
     * }
     */

    //example of dynamic binding
    /*
     * class animal {
     * void eat(){
     * system.out.println("animal is eating");
     * }
     * class dog extends animal{
     * void eat(){
     * system.out.print("dog is eating");
     * 
     * }
     * public static void main(String args []){
     * a.eat();
     * }
     * }
     * }
     */

}
