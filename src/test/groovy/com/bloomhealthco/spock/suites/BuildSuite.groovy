package com.bloomhealthco.spock.suites

import com.bloomhealthco.spock.groups.Broken
import com.bloomhealthco.spock.groups.Build
import com.bloomhealthco.spock.specs.FourSpec
import com.bloomhealthco.spock.specs.ThreeSpec
import org.junit.experimental.categories.Categories
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Categories.class)
@Categories.IncludeCategory(Build.class)
@Categories.ExcludeCategory(Broken.class)
@Suite.SuiteClasses([ThreeSpec.class, FourSpec.class])
class BuildSuite {}
