public class newclg1b {
    public static void main(String[] args) {
     
    
  int[]  numbers = {12,23,45,67,43};
int largest = numbers[0];
int smallest = numbers[0];

 for(int i = 0; i<numbers.length; i++){
    if(numbers[i]>largest){
        largest = numbers[i];
    }
    if(numbers[i]<smallest){
        smallest = numbers[i];
    }
 }

    }}