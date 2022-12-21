package com.pharmapartners2.api.repository;

import org.springframework.stereotype.Repository;

@Repository
public class VisitingCardRepository {
/*    @PersistenceContext
    private EntityManager entityManager;
    public VisitingCardModel getVisitingCard(){
        //Query query = entityManager.createNativeQuery("SELECT * FROM Patienten FULL OUTER JOIN MedicatieVoorschrift ON Patienten.id = MedicatieVoorschrift.patientId FULL OUTER JOIN Journaal ON Patienten.id = Journaal.patientId FULL OUTER JOIN LichamelijkOnderzoek ON Patienten.id = LichamelijkOnderzoek.patientId FULL OUTER JOIN Episode ON Patienten.id = Episode.patientId");
        Query query = entityManager.createNativeQuery("SELECT * FROM Patienten FULL OUTER JOIN MedicatieVoorschrift ON Patienten.id = MedicatieVoorschrift.patientId FULL OUTER JOIN Journaal ON Patienten.id = Journaal.patientId FULL OUTER JOIN LichamelijkOnderzoek ON Patienten.id = LichamelijkOnderzoek.patientId FULL OUTER JOIN Episode ON Patienten.id = Episode.patientId");

        long episodeModelList = query.getSingleResult();
    }*/

}
