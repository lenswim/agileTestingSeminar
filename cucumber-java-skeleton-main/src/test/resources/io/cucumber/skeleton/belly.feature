Feature: Belly

Scenario: eating 2 cookies
    Given I have a growling belly
    When I eat 2 cookies
    Then my belly should still growl

Scenario: eating 3 cookies
    Given I have a growling belly
    When I eat 3 cookies
    Then my belly should no longer growl