Feature: Buy Product
  I as a common user, need to buy a product
  Scenario: Successful Purchase
    Given the user enters the web page
    When the user adds two products to the cart and has placed an order
    Then the user has purchased the products successfully