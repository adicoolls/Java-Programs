public class newclg5 {
    //static keyword
    //the static keyword is used for memory management mainly. we can apply static keyword with variables, methods, blocks, and nested classes. the static keyword belongs to the class than an instance of the class.

    
    
// * 1.Java static variable=the static variable gets memory only once in the class area at the time of class loading
// * EXAMPLE OF JAVA STATIC KEYWORD
// * class student{
// * int rollno;
// String name;
// static String college = "its"; static variable constructor
// student(int r, String n){
// rollno = r;
// name = n;
// }
// void display(){
// system.out.println(rollno + " " + name " " + college);
// }
// public class TestStaticVariable1{  
//  public static void main(String args[]){  
//  Student s1 = new Student(111,"Karan");  
//  Student s2 = new Student(222,"Aryan");  
//  //we can change the college of all objects by the single line of code  
//  //Student.college="BBDIT";  
//  s1.display();  
//  s2.display();  
// * }


//JAVA STATIC METHOD=a static method belongs to the class rather than the object of a class.

/*
 * class Student{  
     int rollno;  
     String name;  
     static String college = "ITS";  
     //static method to change the value of static variable  
     static void change(){  
     college = "BBDIT";  
     }  
     //constructor to initialize the variable  
     Student(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     //method to display values  
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  
public class TestStaticMethod{  
    public static void main(String args[]){  
    Student.change();//calling change method  
    //creating objects  
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Aryan");  
    Student s3 = new Student(333,"Sonoo");  
    //calling display method  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  
 */
//JAVA STATIC BLOCK =  is used to initialise the static data member . it is executed before the main method at the time of classloading

/*example of static block

 * class A2{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}  
 */
}
