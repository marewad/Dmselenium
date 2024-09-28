@cargo
Feature: cargo creation
 
  @cargo
  Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And click on add and create
    Then Verify cargo
    
    
    @cargo2
  Scenario Outline: verify google
    Given url link
    
    