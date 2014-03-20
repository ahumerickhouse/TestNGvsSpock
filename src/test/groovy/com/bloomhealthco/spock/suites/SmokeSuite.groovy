package com.bloomhealthco.spock.suites

import com.bloomhealthco.spock.groups.Broken
import com.bloomhealthco.spock.groups.Smoke
import com.bloomhealthco.spock.specs.OneSpec
import com.bloomhealthco.spock.specs.SixSpec
import org.junit.experimental.categories.Categories
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Categories.ExcludeCategory(Broken.class)
@Suite.SuiteClasses([OneSpec.class, SixSpec.class ])
class SmokeSuite {}
