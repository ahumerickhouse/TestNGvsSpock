package com.bloomhealthco.testng.tests

import com.bloomhealthco.testng.utilities.Groups
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreeTest {
    @Test(groups = [Groups.BUILD,Groups.REGRESSION,Groups.BROKEN])
    public void testOne() {
        System.sleep(2000)
        println "Test ThreeTest - Groups: smoke, broken"
        Assert.assertTrue(true)
    }
}
