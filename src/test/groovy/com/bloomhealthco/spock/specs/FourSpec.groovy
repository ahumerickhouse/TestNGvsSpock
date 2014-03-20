package com.bloomhealthco.spock.specs

import org.junit.Assert
import spock.lang.Specification

class FourSpec extends Specification{
    def "OneTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec FourSpec - Groups: regression, build")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
