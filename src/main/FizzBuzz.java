package main;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++)
            System.out.println(fizzBuzz(i));
    }

    public static String fizzBuzz(int i){
        if (i % 3 == 0) {
            if (i % 5 == 0)
                return "FizzBuzz";
            return "Fizz";
        }
        if (i % 5 == 0)
            return "Buzz";
        return Integer.toString(i);
    }
}
