
Feature: cargo creation
   
  @cargo
    Scenario Outline: verify shiftPlan
    Given logged in with username and passs
    When select the shiftplan screen
    Then Create new plan and save it
    
    @cargo
    Scenario Outline: verify set POB period for count
    Given logged in with username and passs
    When select the shiftplan screen
    And  Create new plan and save it
    Then Verify the Set Pob Count for Period menu
    
    @Shiftplan
    Scenario Outline: verify delete POB period for count menu
    Given logged in with username and passs
    When select the shiftplan screen
    And  Create new plan and save it
    Then Verify the delete Pob Count for Period menu 
    