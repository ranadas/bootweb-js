package com.rdas.spocktut

import spock.lang.Specification

/**
 * Created by rdas on 23/07/2016.
 */
class StubbingTest extends Specification {

    def "should return Role.USER when asked for role"() {
        given:
        println "here "
        List list = Stub()
        list.size() >> 3
        expect:
        // let's see if this works
        list.size() == 3
    }

}
