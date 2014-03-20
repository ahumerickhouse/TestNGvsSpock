package com.bloomhealthco.spock.suites

import com.bloomhealthco.spock.groups.Broken
import com.bloomhealthco.spock.specs.OneSpec
import com.bloomhealthco.spock.specs.ThreeSpec
import org.junit.experimental.categories.Categories
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Categories.class)
@Categories.IncludeCategory(Broken.class)
@Suite.SuiteClasses([OneSpec.class, ThreeSpec.class])
class BrokenSuite {}
