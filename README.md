Running the proejct from Command Line
Mvn clean test


Running from Intellij or eclipse
RightClick and select Run GoogleSearchRunner


Feature file
/src/test/resources/featurefile/GoogleSearch.feature
Step definition file
/src/test/java/com/cucumber/framework/stepdefinition/GoogleSearch.java
Runner
/src/test/java/com/cucumber/framework/runner/GoogleSearchRunner.java


Facilitate the test to run the test for differnt browsers.
To run on chrome put @chrome in feature file
Example:
@chrome
Scenario: Searching paxo in google searchbox
 Given : I am at the google seach page
 When : I type paxos in search and submit
 Then : Paxos BankChain appears on search results


To run on firefox put @firefox in featurefile
@firefox
Scenario: Searching paxo in google searchbox
 Given : I am at the google seach page
 When : I type paxos in search and submit
 Then : Paxos BankChain appears on search results


 Using a POM (Page Object Model) 
Below class uses PageFactory and POM model
/src/main/java/com/cucumber/framework/helper/PageObject/googlepage/GooglePage.java









