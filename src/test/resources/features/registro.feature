Feature: Restaurant order registration

  Scenario: Successful order registration
    Given the user is on the order registration page
    When the user fills in the order details and submits the form
    Then the order should be registered successfully
