public class newclg4 {
    // constructor
    newclg4(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        newclg4 s1 = new newclg4();
    }
    //parameterized constructor
    
}

/* example of the default constructor
 * class student(){
 * student(){
 * system.out.println("hello world");
 * 
 * }
 * public static void main(String []args){
 * student s1 = new student();
 * 
 * }
 * }
*/
//it is callled constructor beacause it constructs the values at the time of object creation it is not necessary to write  constructor for a class it is beacause java compiler creates a default constructor if your class doesnt have any
/*
 * another example of default constructor with single class
 * class student3{
 * int id';
 * string name;
 * void display(){
 * system.out.println(id + " " + name);
 * 
 * }
 * public static void main(String []args){
 * student3 s1 = new student3();
 * student3 s2 = new student3();
 * s1.display();
 * s2.display();
 * }
 * }
 * 
 */

/*
 * parameterized constructor = a constructor which has a specific number of parameters is called a parameterised constructor
 */

/*
 * example of parameterised constructor
 * class aditya{
 * int id;
 * String name;
 * 
 * aditya(int i, String n){
 * id = i;
 * name = n;
 * 
 * }
 * void display()
 *  {
 * system.out.println(id + " " + name);
 * }
 *  public static void main(String [] args){
 * aditya s1 = new aditya(111, "aditya");
 * aditya s2 = new aditya(222, "virat");
 * s1.display();
 * s2.display();
 * }
 * }
 */

//CONSTRUCTOR OVERLOADING
/*
 * constructor overloading in java is a technique of having more than one constructor with different paramter lists. they are arranged in a way that each constructor performs a different task they are differentiated by the number of parameters in the lists asn their types
 * 
 * class student{
 *int id;
 String name;
 int salary;
 
 student(int i, String n){
 id = i;
 name = n;

 }
 student(int i , String n, int s){
 id = i;
 name = n;
 salary = s;
 }
 void display(){
 system.out.println(id + " " + name " " + salary);
 }
 
 public static void main (String [] args){
 aditya s1 = new aditya(111, "aditya");
 aditya s2 = new aditya(222, "virat", 20000);
 s1.display();
 s2.display();
 }
 }
 * 
 */
//COPY CONSTRUCTOR = there is no copy constructor in java. however , we can copy the values from one object to another like copy constructor in cpp.

/*
 * class student{
 * int id; 
 * String name;
 * 
 * student(int i, String n){
 * int = i;
 * name = n;
 * 
 * }
 * student(student s){
 * int.s = i;
 * name.s = n;
 * 
 * }
 * void display(){
 system.out.println(id + " " + name);
 *}
 * public static void main(String []args){
 * aditya s1 = new aditya(111 , "aditya");
 * aditya s2 = new aditya (s);
 * s1.display();
 * s2.display();
 * 
 * }
 * }
 */
