Feature: feature to fail for testing user registration

  Scenario: Invalidate the user registration
    Given user is logged in to application ChamaMed for test
    And hits the button Cadastro de Usuários
    And hist the button Adicionar Usuario
    When enters nome de usuario, matricula e cargo invalidate
    Then press the button Salvar Cadastro for invalidate