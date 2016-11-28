#Author: pawel.pietrucha@qumak.pl

@tag
Feature: Test contact form works when there are no errors

  @tag1
  Scenario: Check form is validated when there are no errors
    Given I on to google.speedtest website
    When I click on Use PageSpeed Insights link
    #https://tristar.gdynia.pl/pages/public/detailed_map.xhtml
    And Populate tristar.gdynia.pl page to test
    Then I validate the outcomes
