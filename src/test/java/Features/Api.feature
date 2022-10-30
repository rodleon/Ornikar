Feature: Test API Ornikar
 Je souhaite tester les endpoints du Webservice

  @Endpoint1
  Scenario: Récupération des employés
    Given Je me connecte sur postman
    When Je lance une requete Get pour récupérer tous les employés
    Then Je vérifie que la réponse me renvoie tous les employés
    And  Je vérifie que le statut retourné est bien 200
   
 @Endpoint2
 Scenario: Recherche employé par id
    Given Je me connecte sur postman
    When Je lance une requete Get pour récupérer un employé avec en paramètre son id
    Then Je vérifie que la réponse me renvoie le salarié correspondant au paramètre id
    And  Je vérifie que le statut retourné est bien 200
 
 @Endpoint3
 Scenario: Ajouter un nouvel employé
    Given Je me connecte sur postman
    When Je lance une requete POST pour ajouter un nouvel employé 
    Then Je vérifie que la requete est traitée avec succès 
    And  Je vérifie que le statut retourné est bien 200
    
 @Endpoint4
 Scenario: Mise à jour des informations employé
    Given Je me connecte sur postman
    When Je lance une requete PUT pour modifier les informations 
    Then Je vérifie que la requete est traitée avec succès 
    And  Je vérifie que le statut retourné est bien 200
    
    
 @Endpoint5
 Scenario: Suppression employé 
    Given Je me connecte sur postman
    When Je lance une requete DEL pour modifier les informations 
    Then Je vérifie que la requete est traitée avec succès 
    And  Je vérifie que le statut retourné est bien 200