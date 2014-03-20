package com.bloomhealthco.spock.specs

import org.junit.Assert
import spock.lang.Specification

class SixSpec extends Specification{
    def "OneTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec SixSpec - Groups: regression, smoke")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
