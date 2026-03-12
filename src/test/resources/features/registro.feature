Feature: Complete order flow through the restaurant application

  Scenario: Customer places an order with notes and receives confirmation
    Given the customer is on the Sofka restaurant login page
    When the customer starts a session
    And selects table number 3 from the table grid
    And adds a product from the menu to the cart
    And enters the note "Sin cebolla, por favor" in the cart
    And confirms the order
    Then the order confirmation screen should be displayed

  Scenario: Customer places an order without notes and receives confirmation
    Given the customer is on the Sofka restaurant login page
    When the customer starts a session
    And selects table number 7 from the table grid
    And adds a product from the menu to the cart
    And confirms the order without adding notes
    Then the order confirmation screen should be displayed
