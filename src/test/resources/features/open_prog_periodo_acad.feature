#Autor: User
  #language:en

Feature: Realizar una simulación de préstamo de libre inversión
  Dado que ingresé al sitio web de Bancolombia


  Scenario: Go to the head of department menu page
    Given User is in the select role page
    When User clicks the button to login as head of department
    Then User can see the head of department menu page

  Scenario: go to the vicedean menu page
    Given User is in the select role page
    When User clicks the button to login as vicedean
    Then User can see the vicedean menu page