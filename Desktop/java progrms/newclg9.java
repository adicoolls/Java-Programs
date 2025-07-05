public class newclg9 {
    //super keyword
    //the super keyword in java is a reference variable which is used to refer immediate parent class object.

    //whenever you create the instance of the subclass, an instance of the parent class will be created as well.
    
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }

}
class student{
    void display(){
        System.out.println("hello");
    }
}
//EXAMPLE OF SUPER KEYWORD
/*
 * class animal{
 * String color = "white";
 * 
 * }
 * class dog extends animal{
 * String color = "black";
 * 
 * 
 * 
 * void printcolor(){
 * system.out.println(color);  print color of dog class
 * system.out.println(super.color); prints color of animal class
 * }
 * }
 * class TestSuper1{
 * public static void  main(String []args){
 * dog d = new dog();
 * d.printColor();
 * }
 * }
 */
//ANOTHER EXAMPLE TO INVOKE PARENT CLASS METHOD

/*
 *class animal{
 void eat(){
 system.out.println("eating");
 }
 }
 class dog extends animal{
 void eat(){system.out.println("eating bread");}
 void bark(){system.out.println("barking");}
 void work(){
 super.eat();
 bark();

 }
 }
 class TestSuper2{
 public static void main(String [] args){
 dog d = new dog();
 d.work();
 }
 }
 */