 
    //method overloading
    //if class has multiple method having same name but different parameters then it is called method overloading.
    // 1 METHOD OVERLOADING:CHANGING NO OF ARGUMENTS
    /*
  * class adder{
* static int add(int a, int b){return a + b;}
  static int add(int a , int b, int c){return a + b + c;}
* }
class testoverloading{
public static void main(String [] args){
system.out.println(adder.add(11,11));
system.out.println(adder.add(11,11,11));
}
}
//in above progam we use static methods so that we dont need to create instance for calling methods.

*/
//2.METHOD OVERLOADING: CHANGING DATA TYPE OF ARGUMENTS
 /*
  * class adder{
  static int add (int a, int b ){return a + b ;}
  static double add (double a, double b){return a + b ;}

  }
  class testoverloading{
  public static void main(String [] args){
  system.out.println(adder.add(11,11));
  system.out.println(adder.add(12.4, 12.3));
  }
  }
  */
  //EXAMPLE WITH OUT STATIC METHOD WITH CONSTRUCTOR OVERLOADING

class newclg6{
   int add ;
   int bad;
 newclg6(int a, int b){
 add = a;

 bad = b;
}
void display(){
System.out.println(a + b);
}
 }
class testadder{
public static void main(String[] args){
newclg6 a1 = new newclg6( 23, 45);

}
}


