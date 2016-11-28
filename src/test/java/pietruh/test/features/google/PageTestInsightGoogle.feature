#Author: pawel.pietrucha@qumak.pl
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test contact form works when there are no errors
  @tag1
  Scenario: Check form is validated when there are no errors
    Given I on to google.speedtest website
    When I click on Use PageSpeed Insights link
    #https://tristar.gdynia.pl/pages/public/detailed_map.xhtml
    And Populate tristar.gdynia.pl page to test
    Then I validate the outcomes
