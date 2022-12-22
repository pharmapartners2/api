package com.pharmapartners2.api.dao;

import java.util.List;

public class VisitingCardModel {
    private EpisodeModel episodeList;
    private List<MedicationPrescriptionModel> medicationPrescriptionList;

    public EpisodeModel getEpisodeList() {
        return episodeList;
    }

    public List<MedicationPrescriptionModel> getMedicationPrescriptionList() {
        return medicationPrescriptionList;
    }

    public void setEpisodeList(EpisodeModel episodeList) {
        this.episodeList = episodeList;
    }

    public void setMedicationPrescriptionList(List<MedicationPrescriptionModel> medicationPrescriptionList) {
        this.medicationPrescriptionList = medicationPrescriptionList;
    }
}
