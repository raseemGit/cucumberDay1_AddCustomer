@tag
Feature: Add A Customer
  I want to use this template for my feature file

  @tag1
  Scenario Outline: To Generate A Five Set Of Customer Id
    Given User Should Launch The Browser
    And User Click The Add User
    When User Should Give The valid Detail "<fname>","<lname>","<email>","<address>","<phone>"
    Then I validate the customer id Showing or not

    Examples: 
      | fname   | lname  | email                 | address    | phone       |
      | moha    | raseem | raseem.moha@gmail.com | chennai    |  9442932436 |
      | krishna | kumar  | krish@gmail.com       | trichy     |  0987654321 |
      | jai     | shree  | jai@gmail.com         | coimbatore | 09876342321 |
      | krishna | jai    | shree@gmail.com       | pondy      | 09809874321 |
      | mohamed | shree  | moha@gmail.com        | coimbatore | 09876542321 |
