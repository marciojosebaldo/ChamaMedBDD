Feature: feature to register interruptor

  Scenario: Validate the register interruptor
    Given the user is on the interruptor's page
    And hits the button Adicionar Interruptor
    When enters nome, true and setor
    Then press the button Salvar Cadastro to create new interruptor