Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    Then User is navigated to login page
    Then validate logout

    Examples:
    | username | password |
    | Admin    | admin123 |


