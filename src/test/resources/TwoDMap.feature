@tag
Feature: Tarrif Plan
  I want to use this template for my feature file

  @tag1
  Scenario: The customer add tarrif plan and getting confirmation
    Given User Should Launch The Browser
    And User Click The Add Tarrif Plan
    When User Should Give The valid Detail
    |MonthRental|Loc Minutes|Int Minutes|Sms Pack|Loc Min Charge|Int Min Charge|Sms Per Charge|
    |10|20|30|40|50|60|70|
    |101|201|301|401|501|601|701|
    |102|203|304|405|506|606|706|
		Then User get the confirmation 

