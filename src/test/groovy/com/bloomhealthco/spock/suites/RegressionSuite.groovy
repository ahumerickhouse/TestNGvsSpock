package com.bloomhealthco.spock.suites

import com.bloomhealthco.spock.groups.Broken
import com.bloomhealthco.spock.groups.Regression
import com.bloomhealthco.spock.specs.FiveSpec
import com.bloomhealthco.spock.specs.FourSpec
import com.bloomhealthco.spock.specs.OneSpec
import com.bloomhealthco.spock.specs.SixSpec
import com.bloomhealthco.spock.specs.ThreeSpec
import com.bloomhealthco.spock.specs.TwoSpec
import org.junit.experimental.categories.Categories
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Categories.class)
@Categories.IncludeCategory(Regression.class)
@Categories.ExcludeCategory(Broken.class)
@Suite.SuiteClasses([OneSpec.class, TwoSpec.class, ThreeSpec.class, FourSpec.class, FiveSpec.class, SixSpec.class ])
class RegressionSuite {}
