#languaje:us

Feature: Create Clients
  As admin
  I want to create clients
  So that I can Offer my products successfully

@CreateClient
Scenario: Send self information
Given you are inside siigo application
  When you go to create a new client
  Then you should see a form to add the client information