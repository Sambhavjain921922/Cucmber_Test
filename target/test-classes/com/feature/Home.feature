Feature: I want to select Address and to search items.
  I want to Select to Address to deliver the product.

  
  Scenario: Address
    Given User Launch Browser
    And navigate to website
    When User Enter Pincode
    Then User check their delivery Date

  Scenario: Mobiles
     Given User Launch Browser
    And navigate to website
    When Click on Mobile Button
    Then User will Navigate to mobile page

    