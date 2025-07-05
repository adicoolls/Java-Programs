public class newclg8 {
    //covariant return type
    //the covariant return type specifies that the return type may vary in the same direction as the subclass
  //EXAMPLE OF COVARIANT RETURN TYPE
  /*
   * class A{
   * A get(){return this;}
   * 
   * }
   * class B1 extends A{
   * @override
   * B1 get(){return this;}
   * void message(){
   * system.out.println("welcome to covariant return type");
   * }
   * public static void main(String []args){
   * new B1().get().message();
   * }
   * }
   * here we change the return type in the both subclass to the class type, we gave the class the subclass name to the method this process led to the property of flexibility and reusability
   */

   //REAL EXAMPLE OF THE COVARIANT RETURN TYPE
   /*
    *class A1{
    A1 foo(){
    return this;
    }
    void print(){
    system.out.println("inside the class A1");
    }
    }
    class A2 extends A1{
    A2 foo(){
    return this;
    }
    void print(){
    system.out.println("inside the class A2");
    }
    }
    class A3 extends A2{
    A3 foo(){
    return this;
    }
    void print(){
    system.out.println("inside the class A3");

    }
    }
    public class test{
    public static void main(Stirng []args){
    
    A1 a1 = new A1();
    a1.foo();
    a1.print();
    A2 a2 = new A2();
    a2.foo();
    a2.print();
    A3 a3 = new A3();
    a3.foo();
    a3.print();
    
    }
    }
     
    */

}
