import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args) {

        // variable for retry
        String retry = "y";     // initial variable for retry
        Scanner number_input = new Scanner(System.in);      // scanner for number
        Scanner retry_input = new Scanner(System.in);       // scanner for retry

        // loop for retry
        while (retry.equals("y")) {
            System.out.print("Enter a number for FizzBuzz Program: ");
            int number = number_input.nextInt();

            // for loop to generate fizzbuzz output
            for(int i = 1; i <= number; i++){
                fizzBuzz(i);    // calls fizzbuzz method
            }

            System.out.print("Enter y for retry. Other to quit");   // asks user for retry
            retry = retry_input.nextLine();
        }

    }

    // method for fizzbuzz
    public static String fizzBuzz(int x){

        // Finding FizzBuzz
        if (x % 3 == 0 && x % 5 ==0){
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }

        // Finding Fizz
        else if(x % 3 == 0){
            System.out.println("Fizz");
            return "Fizz";
        }

        // Finding Buzz
        else if(x % 5 == 0){
            System.out.println("Buzz");
            return "Buzz";
        }

        // returns the number that is not Fizz, Buzz, nor FizzBuzz
        else{
            System.out.println(Integer.toString(x));
            return Integer.toString(x);
        }
    }
}
