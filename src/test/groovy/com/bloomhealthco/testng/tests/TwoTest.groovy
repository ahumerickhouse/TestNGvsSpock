package com.bloomhealthco.testng.tests

import com.bloomhealthco.testng.utilities.Groups
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoTest {
    @Test(groups = [Groups.REGRESSION])
    public void testOne() {
        System.sleep(2000)
        println "Test TwoTest - Groups: smoke, broken"
        Assert.assertTrue(true)
    }
}
