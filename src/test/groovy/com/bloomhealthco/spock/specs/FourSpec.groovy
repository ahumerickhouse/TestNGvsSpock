package com.bloomhealthco.spock.specs

import com.bloomhealthco.spock.utilities.Build
import com.bloomhealthco.spock.utilities.Regression
import org.junit.Assert
import spock.lang.Specification
import org.junit.experimental.categories.Category

class FourSpec extends Specification{
    @Category([Regression.class, Build.class])
    def "FourTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec FourSpec - Groups: regression, build")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
