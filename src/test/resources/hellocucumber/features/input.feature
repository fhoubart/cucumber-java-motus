Feature: Gestion des interactions
    Teste si l'installation de cucumber est bonne


    Scenario: Demarrage du jeu
    Given Le mot a deviner est "PRALINE"
    When le jeu demarre
    Then affiche un message "C'est parti!"

    Scenario: Mot avec moins de 7 lettres
    Given Le mot a deviner est "PRALINE"
    And le joueur propose "P"
    Then affiche un message "Le mot doit faire 7 lettres"

    Scenario: Mot avec plus de 7 lettres
    Given Le mot a deviner est "PRALINE"
    And le joueur propose "PRALINES"
    Then affiche un message "Le mot doit faire 7 lettres"

    Scenario: Mot avec plus de 7 lettres
    Given Le mot a deviner est "PRALINE"
    And le joueur propose "PRALINE"
    Then affiche un message "Vous avez gagne !"

    



    
    