package com.bloomhealthco.spock.specs

import org.junit.Assert
import spock.lang.Specification

class FiveSpec extends Specification{
    def "OneTest"() {
        when: "A user prints a line"
        System.sleep(4000)
        println "Spec FiveSpec - Groups: smoke, broken"

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
