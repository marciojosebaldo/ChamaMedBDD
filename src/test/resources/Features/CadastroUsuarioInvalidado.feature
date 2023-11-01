Feature: feature to fail for testing user registration

  Scenario: Invalidate the user registration
    Given user is logged in to application ChamaMed for test
    And hits the button Cadastro de Usuários
    When hist the button Adicionar Usuario
    Then enters nome de usuario, matricula e cargo invalidate