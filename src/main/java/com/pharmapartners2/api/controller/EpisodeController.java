package com.pharmapartners2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmapartners2.api.dao.EpisodeModel;
import com.pharmapartners2.api.dao.IcpcCode;
import com.pharmapartners2.api.model.EpisodeRequest;
import com.pharmapartners2.api.repository.EpisodeRepository;
import com.pharmapartners2.api.repository.IcpcCodeRepository;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EpisodeController {
    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private IcpcCodeRepository icpcCodeRepository;

    @GetMapping("/episode/{patientId}")
    public @ResponseBody List<EpisodeModel> getEpisodeByPatientId(@PathVariable int patientId) {
        return episodeRepository.findEpisodeByPatientId(patientId);
    }

    @PostMapping(value = "/episode")
    public EpisodeModel CreateEpisodeMethod(@RequestBody EpisodeRequest newEpisode) {
        IcpcCode icpc = icpcCodeRepository.findById(newEpisode.icpccode());
        EpisodeModel episode = new EpisodeModel();
        episode.setPatientId(newEpisode.patientId());
        episode.setIcpcCode(icpc);
        episode.setBeschrijving(newEpisode.beschrijving());
        episode.setDatum(newEpisode.datum());
        return episodeRepository.save(episode);
    }

}