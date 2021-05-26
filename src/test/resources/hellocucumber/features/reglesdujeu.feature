Feature: Les règles du jeu de Motus

    Les différentes règles de reconnaissance des lettes

    Scenario: Lettre bien placée
    Given Le mot a deviner est "<mot>"
    When le joueur propose "<proposition>"
    Then la case 1 est "<c1>"
     And la case 2 est "<c2>"
     And la case 3 est "<c3>"
     And la case 4 est "<c4>"
     And la case 5 est "<c5>"
     And la case 6 est "<c6>"
     And la case 7 est "<c7>"

     Examples:
         | mot     | proposition |  c1    |  c2    |  c3    |  c4    |  c5    |  c6    |  c7    |
         | PRALINE | PARRAIN     | rouge  | jaune  | jaune  | jaune  | jaune  | jaune  | jaune  |
         | PRALINE | PBBBBIN     | rouge  | noir   | noir   | noir   | noir   | rouge  | rouge  |

     
    
