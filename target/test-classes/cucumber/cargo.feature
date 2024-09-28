@mm
Feature: cargo creation
 
  @mm
  Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And click on add and create
    Then Verify cargo
    
    
    @mm
  Scenario Outline: verify google
    Given url link
    
    