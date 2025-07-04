public class college10b {

     public void perimeter(double i, double j){
        double perimeter = 2*(i+j);
        System.out.println("the perimeter of the rectangle is "+perimeter);
     }
    public static void main(String[] args) {
        double i = 10, j = 12;
        college10b obj = new college10b();
        obj.perimeter(i, j);
    }
}
