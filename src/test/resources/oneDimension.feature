@tag
Feature: Add A Customer
  I want to use this template for my feature file

  @tag1
  Scenario: Customer Should Provide The Detail
    Given User Should Launch The Browser
    And User Click The Add User
    When User Should Give The valid Detail
      | fname   | moahmed               |
      | lname   | raseem                |
      | email   | raseem.moha@gmail.com |
      | address | chennai               |
      | phone   |            9442932436 |
    Then I validate the customer id Showing or not
