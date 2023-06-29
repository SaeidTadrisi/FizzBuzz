public class FizzBuzz {
    public String play(int number) {

        String result = String.valueOf(number);

        if (modulo3(number)) result = "Fizz";
        if (modulo5(number)) result = "Buzz";
        if (modulo3(number) && modulo5(number)) result = "FizzBuzz";
        return result;
    }

    private static boolean modulo3(int number) {
        return number % 3 == 0;
    }

    private static boolean modulo5(int number) {
        return number % 5 == 0;
    }
}
