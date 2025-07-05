public class newclg2 {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sayhello(){
        System.out.println("hello my name is "+ name + "and i am" + age + "years old");
    }
    public static void main(String[] args) {
        
    }
}
 /*class student{
  * int id;
  string name;
 } 
public static void main(String[] args) {
  student s1 = new student();
  system.out.println(s1.name);
  system.out.println(s1.id);
 }
} 
 */
//with two classes
/*
 * class student{
 * int id;
 * string name;
 * 
 * }
 * class teststudent{
 * public static void main(String[] args) {
 * student s1 = new student();
 * system.out.println(s1.name);
 * system.out.println(s1.id);}
 */

//3 ways of initializing the object= the initialising the object means storing the values in the object
//1. by using reference
/*
 * class student{
 * int id;
 * string anme;
 * }
 * class teststudent{
 * public static void main(String[] args) {
     student s1 = new student();
     s1.id=1;
     s1.name= "aditya";
     
     system.out.println(s1.name);
     system.out.println(s1.id);
 }
 */

 // we can also create multiple objects and store information in it through reference variable
 /*
  * class student{
   int id;
   string name;

}
   class teststudent{
   public static void main(String[] args) {
       student s1 = new student();
       student s2 = new student();

    s1.id=1;
    s1.name="aditya";
    s2.id=2;
    s2.name="sachin";
    
    system.out.println(s1.name);
    system.out.println(s1.id);
    system.out.println(s2.name);
    system.out.println(s2.id);

   }
   }
  */
  /*
   * class student{
   * int roll;
   * string name;
   * 
   * void insertrecord(int r, string n){
   * roll=r;
   * name=n;
   * }
   * void displayinsertrecord(){
   * system.out.println("the rollno is " + r + "the name of the student is "+ name)}
   * }
   * public class teststudent(){
   * public static void main(String []args){
   * student s1 = new student();
   * student s2 = new student();
   * s1.insertrecord(111,"aditya");
   * s1.insertrecord(222,"virat");
   * s1.displayinsertrecord();
   * s2.displayinsertrecord();
   * }
   * }
   * note=here the variable gets data in single step like a heap
   */
//3. initialization through a constructor
/*
 * class employee(){
 * int id;
 * String name;
 * float salary;
 * 
 * void insert(int i, string n, float s){
 *  id = i;
 * name = n;
 * salary = s;
 * }
 * void display(){
 * system.out.println("the id of the employee is "+id+"the name of the employee is "+ name + "salary of the employee is "+ salary)}
 * 
 * }
 * public testemployee(){
 *  public static void main (String []args){
 * employee e1 = new employee();
 * employee e2 = new employee();
 * e1.insert(111,"aditya", 33333);
 * e2.insert(222,"virat", 44444)
 * e1.display();
 * e2.display();
 * 
 * }
 * }
 */
//lets see the full example of anonymous object in java with the program of factorial
/*
 * class calculation{
 * void fact(int n){
 * int fact = 1;
 * for( int i = 0; i<=n;i++){
 * fact = fact*i;
 * }
 * system.out.println("factorial is " + fact);
 * 
 * }
 * public static void main(String []args){
 * new calculation().fact(4);
 * }
 * }
 */
/*
 * the example of student their marks, id , name with the help of reference variable in class object
 * class student{
 * void insert(int i, String name, int m){
 * id = i;
 * name = n;
 * marks = m;
 * 
 * }
 * void display(){
 * system.out.println("the id of the student is"+ id + "the name of the student is"+ name+"the marks of the student is "+ marks);
 * }
 * }
 * public class TestStudent(){
 * public static void main(String [] args){
 * student s1 = new student();
 * student s2 = new student();
 * 
 * s1.insert(333,"aditya",24);
 * s2.insert(444,"virat",25);
 * s1.display();
 * s2.display();
 * }
 * }
 * 
 */
//the example of area of rectangle
/*
 * class rectangle{
 * int length;
 * int width;
 * void insert(int l, int w){
 * length = l;
 * width = w;
 * 
 * }
 * void display(){
 * system.out.println("the area of the rectangle is" length*width);
 * }
 * }
 * public class testrectangle{
 * public static void main (String []args){
 * rectangle r1 = new rectangle();
 * rectangle r2 = new rectangle();
 * r1.insert(12,10);
 * r2.insert(8,10);
 * r1.display();
 * r2.display();
 * }
 * }
 */
