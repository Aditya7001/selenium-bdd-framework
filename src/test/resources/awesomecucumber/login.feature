Feature: User Login

 Scenario Outline: Verify user can do login with valid credentials
    Given User is on login page with browser "<browser_name>" url "<application_url>"
    Then user is on homepage
   Examples:
     | browser_name | application_url            |
     | chrome       | https://demo.opencart.com/ |