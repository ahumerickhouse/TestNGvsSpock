package com.bloomhealthco.testng.tests

import com.bloomhealthco.testng.utilities.Groups
import org.testng.Assert;
import org.testng.annotations.Test;

public class FourTest {
    @Test(groups = [Groups.BUILD,Groups.REGRESSION])
    public void testOne() {
        System.sleep(2000)
        println "Test FourTest - Groups: smoke, broken"
        Assert.assertTrue(true)
    }
}
