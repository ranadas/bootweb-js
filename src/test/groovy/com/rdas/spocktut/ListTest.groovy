package com.rdas.spocktut

import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Title
import spock.lang.Unroll

/**
 * Created by rdas on 23/07/2016.
 */
@Title('This test will test documenting features of Spock Framework')
@Narrative('''
As a Developer using Spock Framework for testing,
I want to be see Specifications documented,
so that my Business Analyst understand what is this all about.
''')
class ListTest extends Specification {

    def "should not be empty after adding element"() {
        given:
        def list = []

        when:
        list.add(42)

        then:
        // Asserts are implicit and not need to be stated.
        // Change "==" to "!=" and see what's happening!
        list.size() == 1
        list == [42]
    }

    @Unroll
    def 'should select max of two numbers ( #a and #b )'() {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c // these are vars will be available above in test,
        5 | 1 | 5 // initialized to these values!
        9 | 9 | 9
    }

    @Unroll
    def "should sort list of numbers #a #b"() {
        given:
        def list = [a, b]

        when:
        def calculated = list.sort()

        then:
        calculated == expectedResult

        where:
        a | b | expectedResult
        5 | 1 | [1, 5]
        9 | 9 | [9, 9]
    }

    @Unroll
    def 'should compute the maximum of two numbers'() {
        expect:
        Math.max(a, b) == c

        where:
        a << [1, 4]
        b << [2, 3]
        c << [2, 4]
    }

}
