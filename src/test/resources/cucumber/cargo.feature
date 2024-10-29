@cargo
Feature: cargo creation
 
  @cargo
  Scenario: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify cargo status as registered
    
    
    @cargo
    Scenario: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify cargo status as Approved
    
    @cargo
    Scenario: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify cargo status as Rejected
    
    @cargo
    Scenario: verify cargo
    Given logged in with username and pass
    When select the cargo screen
    And Create new cargo
    Then Verify Menu Go to Change log
    
    
    @mm
    Scenario: verify google
    Given url link
    
    