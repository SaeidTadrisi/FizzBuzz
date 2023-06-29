import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_1_given_1() {

        String result = fizzBuzz.play(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_2_given_2() {

        String result = fizzBuzz.play(2);

        assertThat(result).isEqualTo("2");
    }

    @Test
    void should_return_4_given_4() {

        String result = fizzBuzz.play(4);

        assertThat(result).isEqualTo("4");
    }

    @Test
    void should_return_fizz_given_3() {

        String result = fizzBuzz.play(3);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_fizz_given_6() {

        String result = fizzBuzz.play(6);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_fizz_given_9() {

        String result = fizzBuzz.play(9);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_fizzbuzz_given_15() {

        String result = fizzBuzz.play(15);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_fizzbuzz_given_30() {

        String result = fizzBuzz.play(30);

        assertThat(result).isEqualTo("FizzBuzz");
    }
}
