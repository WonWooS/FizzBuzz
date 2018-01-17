import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args) {

        String retry = "y";
        Scanner input = new Scanner(System.in);
        while (retry.equals("y")) {
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.print("Enter a number for FizzBuzz Program: ");
            int n = reader.nextInt(); // Scans the next token of the input as an int.

            fizzBuzz(n);

            System.out.print("Would you like to do it again? <y/n>");

            retry = input.nextLine();
        }

    }
    public static String fizzBuzz(int x){
        if (x % 3 == 0 && x % 5 ==0){
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }
        else if(x % 3 == 0){
            System.out.println("Fizz");
            return "Fizz";
        }
        else if(x % 5 == 0){
            System.out.println("Buzz");
            return "Buzz";
        }
        else{
            System.out.println(Integer.toString(x));
            return Integer.toString(x);
        }
    }
}
