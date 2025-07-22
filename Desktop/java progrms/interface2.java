interface vehicle {
    void model();
    void max_speed();


}
class mercedes implements vehicle{
    public void model(){
        System.out.println("the model of the mercedes is E class");
    }
    public void max_speed(){
        System.out.println("the max speed of the car is 300kmph");
    }
}
class BMW implements vehicle{
    public void model(){
        System.out.println("the model of the BMW is A6");

    }
    public void max_speed(){
        System.out.println("the maximum speed of the car is 250kmph");
    }
}
public class interface2 {
    public static void main(String[] args) {
         vehicle f = new mercedes();
         vehicle e = new BMW();

         f.model();
         f.max_speed();
         e.model();
         e.max_speed();
    }
}