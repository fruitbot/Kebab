#Author: shuting.zhang@dauphine.eu, zam@dauphine.fr
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
@tag
Feature: US001 Ajouter des kebabs dans un menu

En tant que vendeur
Je veux gérer les commandes de menu kebab, quand un client veut plusieurs kebabs dans son menu, je le fais.

  @tag1
  Scenario Outline: Ajouter des kebabs dans un menu
    Given la création d un menu <myMenu> avec attribut <drink>, <withFries>, <kebabs> and <price>, les création des kebabs <myKebab1>, <myKebab2>, <myKebab3>
    When l utilisateur valide
    Then les kebabs sont ajoutés dans le menu

    Examples: 
      | myMenu 	 | kebabs | 
      | myKebab1 | drinks, withFries, ArrayList(myKebab1,myKebab2,myKebab3),price| 

      