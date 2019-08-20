#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Test
Feature: Title of your feature
  I want to use this template for my feature file

  @Test
  Scenario: Title of your scenario
    Given abro el navegador e ingreso al buscador de google
    When dijito la palabra pruebaz
    And el buscador cargue la palabra correcta 
    Then obtengo la lista de los resultados
    And verifico que sean mas de seis
