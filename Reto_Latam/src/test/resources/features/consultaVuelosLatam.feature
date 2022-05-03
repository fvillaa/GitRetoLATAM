#language:en
#Autor: Fernando Villa Alvarez
@stories
Feature: consultaVuelosLatam
  As a LATAM user, I want to make flight inquiries to see the options and prices they offer me

  @scenario1
  Scenario Outline: flights consultant in LATAM
    Given  LATAM Airlines Customer
    When check available flights
      | trayecto   | origen   | destino   | idafecha   | vueltafecha   |
      | <trayecto> | <origen> | <destino> | <idafecha> | <vueltafecha> |
    Then Know the options and prices that they offer me

    Examples:
      | trayecto     | origen                  | destino                  | idafecha      | vueltafecha    |
      | Solo ida     | Pereira, PEI - Colombia | Medellín, MDE - Colombia | jue. 9 de jun | dom. 12 de jun |
      | Ida y Vuelta | Pereira, PEI - Colombia | Medellín, MDE - Colombia | mié. 1 de jun | vie. 3 de jun  |