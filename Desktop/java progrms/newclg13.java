public class newclg13 implements Cloneable {
    //object cloning in java
    //the object cloning is a way to create exact copy of an object.the clone() method of object class is used to clone an object
    //the clone() method is defined in the object class. syntax of the clone() method is as follows
    //protected Object clone() throws CloneNotSupportedException

    //why we use the clone() method = the clone() method saves the extra processing task for creating the exact copy of an object . if we perform it by using the new keyword it will take a lot of processing time to be performed that is why we use object cloning

    //example of clone() method (object cloning)

   int rollno;
   String name;

   newclg13(int rollno , String name){
    this.rollno = rollno;
    this.name = name;
   }
   public Object clone() throws CloneNotSupportedException{
    return super.clone();
   }
   public static void main(String[] args) {
    try{
        newclg13 s1 = new newclg13(101, "aditya");
        newclg13 s2 = (newclg13)s1.clone();

        System.out.println(s1.rollno+""s1.name);
        System.out.println(s2.rollno+""s2.name);
        
    }
    catch(CloneNotSupportedException c){}
   }
}
