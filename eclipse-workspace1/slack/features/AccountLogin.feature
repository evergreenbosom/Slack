#Author: your.email@your.domain.com

Feature: Slack Login
  

  @SlackLogin
  Scenario: Login to Slack Account
    Given Open Browser
    When I invoke Slack signin Method
    And I invoke Slack Workspace Method "imraniham"
    And I invoke User Method "abrariham19@gmail.com"
    And I invoke Password Method "slacktest"
    And I invoke Click Login Method
    Then I validate Workspace "imraniham"
   

 
