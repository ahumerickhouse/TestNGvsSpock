package com.bloomhealthco.testng.tests

import com.bloomhealthco.testng.utilities.Groups
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiveTest {
    @Test(groups = [Groups.REGRESSION,Groups.SLOW])
    public void testOne() {
        System.sleep(4000)
        println "Test FiveTest - Groups: smoke, broken"
        Assert.assertTrue(true)
    }
}
