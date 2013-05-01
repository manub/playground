package net.manub.playground.fizzbuzz

class FizzBuzz {

    String generate(int number) {
        if (isMultipleOf3(number) && isMultipleOf5(number)) {
            "fizzbuzz"
        } else if (isMultipleOf5(number)) {
            "buzz"
        } else if (isMultipleOf3(number)) {
            "fizz"
        } else {
            number;
        }
    }

    private boolean isMultipleOf5(int number) {
        number % 5 == 0
    }

    private boolean isMultipleOf3(int number) {
        number % 3 == 0
    }
}
