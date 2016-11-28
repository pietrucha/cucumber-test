@tag
Feature: Test page hendling

  @tag1
  Scenario Outline: Main page test
    Given I am on main page
    When I click on <Link>
    Then I chceck I am on <Title>
    And I close browser

    Examples: 
      | Link    | Title                                                     |
      | mapa    | https://tristar.gdynia.pl/pages/public/detailed_map.xhtml |
      | kontakt | https://tristar.gdynia.pl/pages/public/contact.xhtml      |
      | pomoc   | https://tristar.gdynia.pl/pages/public/help.xhtml         |
