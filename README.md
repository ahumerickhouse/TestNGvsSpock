#IntelliJ

##Importing
Either import or open the build.gradle file inside test_automation

##Executing Tests
###Command Line
####TestNG
    ./gradlew -PtestNG.group=<GROUP> testNg
    
Groups include:

- smoke
- regression
- build
- slow
- broken

####Spock
    ./gradlew -Dspock.single=<SUITE CLASS> spock
Suite Classes include:

- SmokeSuite
- RegressionSuite
- BuildSuite
- SlowSuite
- BrokenSuite

##Documents

- Docs/Groupings.xlsx
    - Shows what tests will be executed with the corresponding group/suite
- Docs/Parallel Execution TestNG vs Spock.pdf
    - Shows an execution tree if these suites were to be run in parallel
- Docs/TestNG vs Spock.docx
    - Lays out points of interest and compares them to each other

##Real Examples
Look in the test_automation repository under the functional module.  
&#42;Spec is a Spock Specification.  
&#42;Test is a TestNG test.