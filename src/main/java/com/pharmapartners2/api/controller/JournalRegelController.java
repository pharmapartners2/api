package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.EpisodeModel;
import com.pharmapartners2.api.model.JournalRegelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pharmapartners2.api.dao.JournalRegel;
import com.pharmapartners2.api.repository.JournalRegelRepository;

import java.util.List;

@RestController
public class JournalRegelController {
    @Autowired
    private JournalRegelRepository journalRegelRepository;

    @GetMapping("/journal/{patientId}")
    public @ResponseBody List<JournalRegel> getJournalByPatientId(@PathVariable int patientId)
    {
        return journalRegelRepository.findJournalByPatientId(patientId);
    }

    @PostMapping("/journal")
    public JournalRegel journalModel(@RequestBody JournalRegelRequest journalRegelRequest) {
        JournalRegel journalRegel = new JournalRegel();
        journalRegel.setPatientId(journalRegelRequest.patientId());
        journalRegel.setCode(journalRegelRequest.code());
        journalRegel.setBeschrijving(journalRegelRequest.beschrijving());
        journalRegel.setEpisodeId(journalRegelRequest.episodeId());
        journalRegel.setDatum(journalRegelRequest.datum());
        return journalRegelRepository.save(journalRegel);
    }
}