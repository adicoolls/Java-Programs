public class newclg15 extends books {
    void humor(){
        System.out.println("the humor of this book is funny");
    }
    public static void main(String[] args) {
        newclg15 obj = new newclg15();
        obj.humor();
    }
    
}
abstract class books{
    abstract void humor();
}
//abstract class = a class which is declared with the abstract keyword is known as an abstract class in java.it can have abstract and non abstract method(method with no body)
//abstraction is a process  of hiding the implementation details and showing only functionality to the user

//POINTS TO REMEMBER
/*
 * 1.an abstract class must be declared with an abstract keyword
 * 2.it can have abstract and non abstract method
 * 3.it cannot be instantiated;
 * 4.it can have constructor and static method also
 * 5.it can have final method which will force the subclass to change the body of the method
 */