package com.bloomhealthco.spock.suites

import com.bloomhealthco.spock.specs.FiveSpec
import com.bloomhealthco.spock.specs.FourSpec
import com.bloomhealthco.spock.specs.OneSpec
import com.bloomhealthco.spock.specs.SixSpec
import com.bloomhealthco.spock.specs.ThreeSpec
import com.bloomhealthco.spock.specs.TwoSpec
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite.class)
@Suite.SuiteClasses([OneSpec.class, ThreeSpec.class])
class BrokenSuite {

}
