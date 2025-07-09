import java.util.Scanner;

   public class scanner1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = read.nextLine();
        System.out.println("Hello, " + name + "!");

        read.close();
    }
   }

//another program of java scanner class
/*
 * import java.util.scanner;
 * public class scanner1{
 * public static void main(String []args){
 * scanner read = new scanner(system.in);
 * system.out.print("enter your name");
 * String name = read.nextline();
 * system.out.println("hello, " + name + "!");
 * read.close();
 * }
 * }
 */