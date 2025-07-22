public class ladder{
    public static void main(String[] args) {
        double per = 12;
        if(per>=80){
            System.out.println("distinction");

        }
        else if(per >= 60){
            System.out.println("1st class");
        }
        else if(per>=50){
            System.out.println("2nd class");
        }
        else if(per>=40){
            System.out.println("3rd class");
        }
        else if(per>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("the student is failed");
        }
    }
}