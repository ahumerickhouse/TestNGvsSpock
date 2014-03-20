package com.bloomhealthco.testng.tests

import com.bloomhealthco.testng.utilities.Groups
import org.testng.Assert
import org.testng.annotations.Test

class SixTest {
    @Test(groups = [Groups.SMOKE,Groups.REGRESSION])
    public void testOne() {
        System.sleep(2000)
        println "Test SixTest - Groups: smoke, broken"
        Assert.assertTrue(true)
    }
}
