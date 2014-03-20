package com.bloomhealthco.spock.specs

import org.junit.Assert
import spock.lang.Specification

class ThreeSpec extends Specification{
    def "OneTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec ThreeSpec - Groups: regression, build, broken")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
