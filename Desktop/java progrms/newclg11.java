public class newclg11 {
    //runtime polymorphism
    //the runtime polymorphism is the ability of an object to take on many forms
    void run(){
        System.out.println("running");

    }
    class splendor extends newclg11{
        void run(){
            System.out.println("running safely with 60kmph");

        }
        public static void main(String[] args) {
            newclg11 obj = new splendor();
            obj.run();
        }
    }
}

//upcasting = if the referenace variable of parent class refers to the object of child class then it is known as upcasting
//java runtime polymorphism example animal
/*(
 * class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
}  
class Cat extends Animal{  
void eat(){System.out.println("eating rat...");}  
}  
class Lion extends Animal{  
void eat(){System.out.println("eating meat...");}  
}  
class TestPolymorphism3{  
public static void main(String[] args){  
Animal a;  
a=new Dog();  
a.eat();  
a=new Cat();  
a.eat();  
a=new Lion();  
a.eat();  
}} 
) */

//java runtime polymorphism example with data member
/*
 * class bike{
 * int speedlimit = 90;
 * 
 * }
 * class honda3 extends bike{
 * int speedlimit = 150;
 * }
 * public static void main (String args []){
 * bike obj = new honda3();
 * system.out.println(obj.speedlimit);//90
 * 
 * here when we created the object of the class bike at the end we gave the word of subclass also cause of that the object can access both super class and as well as sub class
 * }
 */