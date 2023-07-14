
Feature: Login to VyTrack application with correct credentials to different accounts.
  As a driver, as store manager and as a sales manager.



  Scenario: Login with given user
    Given user is on the login page
    When user enters the "driver" information
    Then user should be able to login