Feature: Le joueur trouve la bonne réponse


    Le joueur donne le mot qu'il fallait trouver


    Scenario: le joueur entre la bonne reponse PRALINE
    Given Le mot a deviner est "PRALINE"
    When le joueur propose "PRALINE"
    Then le joueur a gagne

    Scenario: le joueur entre la bonne reponse POUTINE
    Given Le mot a deviner est "POUTINE"
    When le joueur propose "POUTINE"
    Then le joueur a gagne

    Scenario: le joueur entre la mauvaise reponse
    Given Le mot a deviner est "PRALINE"
    When le joueur propose "POUTINE"
    Then le joueur n'a pas gagne
