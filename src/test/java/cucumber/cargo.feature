@cargo
Feature: cargo creation
 
  @cargo
  Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify cargo status as registered
    
    
    @cargo
    Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify cargo status as Approved
    
    @cargo
    Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify cargo status as Rejected
    
    @cargo
    Scenario Outline: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify Menu Go to Change log
    
    
    @mm
    Scenario Outline: verify google
    Given url link
    
    