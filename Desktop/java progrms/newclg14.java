public class newclg14 {
    //java string
    public static void main(String[] args) {
        // Creating a String
        String greeting = "Hello, World!";
        
        // Getting the length of the String
        int length = greeting.length();
        System.out.println("Length of the string: " + length);
        
        // Concatenating Strings
        String name = "Alice";
        String message = greeting + " My name is " + name;
        System.out.println(message);
        
        // Converting to uppercase
        String uppercaseMessage = message.toUpperCase();
        System.out.println("Uppercase message: " + uppercaseMessage);
        
        // Checking for a substring
        boolean containsHello = message.contains("Hello");
        System.out.println("Message contains 'Hello': " + containsHello); 

        
}
}