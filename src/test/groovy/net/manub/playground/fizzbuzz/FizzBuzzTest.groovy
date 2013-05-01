package net.manub.playground.fizzbuzz

import spock.lang.Specification

class FizzBuzzTest extends Specification {

    def fizzBuzz = new FizzBuzz()

    def "returns number"() {

        expect:
        fizzBuzz.generate(number) == output

        where:
        number  |   output
        1       |   "1"
        2       |   "2"
        4       |   "4"

    }

    def "returns fizz"() {

        expect:
        fizzBuzz.generate(number) == output

        where:
        number  |   output
        3       |   "fizz"
        6       |   "fizz"

    }

    def "returns buzz"() {

        expect:
        fizzBuzz.generate(number) == output

        where:
        number  |   output
        5       |   "buzz"
        10      |   "buzz"

    }

    def "returns fizzbuzz"() {

        expect:
        fizzBuzz.generate(number) == output

        where:
        number  |   output
        15      |   "fizzbuzz"
        30      |   "fizzbuzz"

    }
}
