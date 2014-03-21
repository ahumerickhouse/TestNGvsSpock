package com.bloomhealthco.spock.specs

import com.bloomhealthco.spock.utilities.Regression
import com.bloomhealthco.spock.utilities.Slow
import org.junit.Assert
import spock.lang.Specification
import org.junit.experimental.categories.Category

class FiveSpec extends Specification {
    @Category([Regression.class,Slow.class])
    def "FiveTest"() {
        when: "A user prints a line"
        System.sleep(4000)
        println "Spec FiveSpec - Groups: smoke, broken"

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
