package net.manub.playground.helloworld

import spock.lang.Specification

class HelloWorldTest extends Specification {

    def helloWorld = new HelloWorld()

    def "should greet properly"() {

        expect:
        helloWorld.greet() == greeting

        where:
        greeting = "Hello, world!"

    }
}
