@cargo
Feature: cargo creation
 
@cargo
  Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    Then click on add and create