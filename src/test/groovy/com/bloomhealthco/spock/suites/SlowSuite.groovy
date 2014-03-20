package com.bloomhealthco.spock.suites

import com.bloomhealthco.spock.groups.Broken
import com.bloomhealthco.spock.groups.Slow
import com.bloomhealthco.spock.specs.FiveSpec
import org.junit.experimental.categories.Categories
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Categories.class)
@Categories.IncludeCategory(Slow.class)
@Categories.ExcludeCategory(Broken.class)
@Suite.SuiteClasses([FiveSpec.class])
class SlowSuite {}
