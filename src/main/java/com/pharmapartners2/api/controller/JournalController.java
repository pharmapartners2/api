package com.pharmapartners2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pharmapartners2.api.dao.JournalModel;
import com.pharmapartners2.api.repository.JournalRepository;

import java.util.List;

@RestController
public class JournalController {
    @Autowired
    private JournalRepository journalRepository;

    @GetMapping("/journal/{patientId}")
    public @ResponseBody List<JournalModel> getJournalByPatientId(@PathVariable int patientId)
    {
        return journalRepository.findJournalByPatientId(patientId);
    }

    @PostMapping("/journal")
    public JournalModel journalModel(@RequestBody JournalModel journalModel) {
        return journalRepository.save(journalModel);
    }
}