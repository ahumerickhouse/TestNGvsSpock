package com.bloomhealthco.spock.specs

import com.bloomhealthco.spock.groups.Regression
import com.bloomhealthco.spock.groups.Smoke
import org.junit.Assert
import spock.lang.Specification
import org.junit.experimental.categories.Category

class SixSpec extends Specification {
    @Category([Regression.class, Smoke.class])
    def "SixTest"() {
        when: "A user prints a line"
        System.sleep(2000)
        println("Spec SixSpec - Groups: regression, smoke")

        then: "Assert True"
        Assert.assertTrue(true)
    }
}
