#languaje:us

  Feature:Validate Services
    As admin
  I want to validate several services
  So that i can continue with the project development

  Scenario: Visualize users list
    When the list the users is searched
    Then the next information can be visualized

    Scenario: delete user
      When a request to delete a user is sent
      Then the user should be deleted successfully

    Scenario: create user
      When a request to create a user is sent
      Then the user shouldn't be created successfully

    Scenario: update user
      When a request to update a user is sent
      Then the user shouldn't be updated successfully