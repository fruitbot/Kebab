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
Feature: US000 Afficher le contenu d un menu

En tant que vendeur
Je veux enregistrer les commandes de menu kebab, la sauce, la boisson, avec frites ou non, pour la traçabilité des ventes.

  @tag1
  Scenario Outline: Afficher le contenu d un menu
    Given la création d un menu <myMenu> avec attribut <drink>, <withFries>, <kebabs> and <price>
    When l utilisateur valide
    Then le contenu d un kebab est affiché 

    Examples: 
      | myMenu 	 | value | 
      | myKebab1 | "Voici un menu : Soda: " + drink + ", withFries: "+ withFries + ", kebabs: " + kebabs + ", price :" + price| 

      