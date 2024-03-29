Feature: Testing Weather API

  Scenario: Checking weather for the city
    Given city id: 524901

    When we are requesting weather data

    Then coords are:
      | lon | 145.77 |
      | lat | -16.92 |

    And weather is:
      | id          | 802              |
      | main        | Clouds           |
      | description | scattered clouds |
      | icon        | 03n              |
    And base is: "stations"

    And main is:
      | temp     | 300.15 |
      | pressure | 1007   |
      | humidity | 74     |
      | temp_min | 300.15 |
      | temp_max | 300.15 |
    And visibility is: 10000

    And wind is:
      | speed | 3.6 |
      | deg   | 160 |

    And clouds is:
      | all | 40 |

    And dt is: 1485790200

    And sys is:
      | type    | 1          |
      | id      | 8166       |
      | message | 0.2064     |
      | country | AU         |
      | sunrise | 1485720272 |
      | sunset  | 1485766550 |

    And id is: 2172797

    And name is "Cairns"

    And cod is: 200