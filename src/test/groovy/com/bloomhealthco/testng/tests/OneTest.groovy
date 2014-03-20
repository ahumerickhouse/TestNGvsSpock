package com.bloomhealthco.testng.tests

import com.bloomhealthco.testng.utilities.Groups
import org.testng.Assert;
import org.testng.annotations.Test;

public class OneTest {
    @Test(groups = [Groups.SMOKE,Groups.REGRESSION,Groups.BROKEN])
    public void testOne() {
        System.sleep(2000)
        println "Test OneTest - Groups: smoke, broken"
        Assert.assertTrue(true)
    }
}
