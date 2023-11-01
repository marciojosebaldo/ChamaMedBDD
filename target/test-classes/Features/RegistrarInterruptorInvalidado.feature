Feature: feature to invalidate register interruptor

  Scenario: Invalidate the register interruptor
    Given the user is on the interruptor's page from ChamaMed
    And the user hits the button Adicionar Interruptor
    When enters nome, true and setor invalidate
    Then press the button Salvar Cadastro to try create new interruptor