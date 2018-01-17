import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args) {

        // variable for retry
        String retry = "y";
        Scanner input = new Scanner(System.in);

        //retry loop to run it multiple times
        while (retry.equals("y")) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter a number for FizzBuzz Program: ");
            int n = reader.nextInt();

            // calls fizzBuzz method
            fizzBuzz(n);

            System.out.print("Would you like to do it again? <y/n>");

            retry = input.nextLine();
        }

    }
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
