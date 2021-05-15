#Author: steven.arbelaez7324@gmail.com
@Regresion
Feature: Form Swaglab
  As a user
  I need to verify the correct working of Swaglab
  To check the availability of the site

  Acceptance criteria
  * Verify the successful purchase of an item with the standard user
  * Verify the app blocks the access to locked_out_user
  * Verify the failed purchase of an item
  * Verify the system checks the mandatory fields
  * Verify the successful purchase of the lowest and highest priced items

  @SucessfulCase
  Scenario: Verify the successful purchase of an item with the standard user
    Given I login into the app with username "standard_user" and password "secret_sauce"
    When I select an item from the site and make the buy
      | txtFirstName | txtLastName | txtPostalCode |
      | Steven         | Arbelaez   | 054040 |
    Then Verify the message "THANK YOU FOR YOUR ORDER" after complete the order

  @SucessfulCase
  Scenario: Verify the successful purchase of the lowest and the highest priced items
    Given I login into the app with username "standard_user" and password "secret_sauce"
    When I buy the lower and the higher price items from the site
      | txtFirstName | txtLastName | txtPostalCode |
      | Steven         | Arbelaez   | 054040 |
    Then Verify the message "THANK YOU FOR YOUR ORDER" after complete the order

