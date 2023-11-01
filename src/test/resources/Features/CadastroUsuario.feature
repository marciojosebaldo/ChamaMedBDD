Feature: feature for testing user registration

  Scenario: Validate the user registration
    Given user is logged in to ChamaMed
    And hits the button Cadastro de Usuarios
    And hist the button Adicionar Usuário
    When enters nome de usuario, matricula e cargo
    Then press the button Salvar Cadastro