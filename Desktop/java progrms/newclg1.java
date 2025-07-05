/**
 * newclg1 - the concept of array in java
 * 
 */

// Code Snippet c:/Users/DELL/Desktop/my java code/newclg1.java:(0-1)
//public static void main(String[] args) {    
    //         // syntax of array
    //         int[] arr = new int[5];

 public class newclg1 {
   public static void main(String[] args) {

    

    int[] numbers = {5, 2, 8, 1, 9};
    int largest = numbers[0];
    
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > largest) {
            largest = numbers[i];
        }
    }
    
    System.out.println("The largest element is: " + largest);

    
    
    
    System.out.println("the largest element is:" + largest);
   }
     
}

/*
 * here [] is used for size of the array
 * {} and this is used for element in array
 * 
 */

