package com.bloomhealthco.spock.specs

import com.bloomhealthco.spock.utilities.Broken
import com.bloomhealthco.spock.utilities.Build
import com.bloomhealthco.spock.utilities.Regression
import org.junit.Assert
import spock.lang.Specification
import org.junit.experimental.categories.Category

class ThreeSpec extends Specification {
    @Category([Regression.class, Build.class, Broken.class])
    def "ThreeTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec ThreeSpec - Groups: regression, build, broken")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
