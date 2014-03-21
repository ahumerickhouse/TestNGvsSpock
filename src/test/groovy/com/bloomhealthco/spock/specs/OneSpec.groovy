package com.bloomhealthco.spock.specs

import com.bloomhealthco.spock.utilities.Broken
import com.bloomhealthco.spock.utilities.Regression
import com.bloomhealthco.spock.utilities.Smoke
import org.junit.Assert
import spock.lang.Specification
import org.junit.experimental.categories.Category

class OneSpec extends Specification {
    @Category([Regression.class, Smoke.class, Broken.class])
    def "OneTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec OneSpec - Groups: regression, smoke, broken")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
