package com.bloomhealthco.spock.specs

import com.bloomhealthco.spock.groups.Regression
import org.junit.Assert
import spock.lang.Specification
import org.junit.experimental.categories.Category

class TwoSpec extends Specification {
    @Category(Regression.class)
    def "TwoTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec TwoSpec - Groups: regression")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
