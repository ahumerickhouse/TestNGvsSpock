package com.bloomhealthco.spock.specs

import org.junit.Assert
import spock.lang.Specification

class OneSpec extends Specification{
    def "OneTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec OneSpec - Groups: regression, smoke, broken")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
