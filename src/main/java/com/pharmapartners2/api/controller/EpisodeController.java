package com.pharmapartners2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pharmapartners2.api.dao.EpisodeModel;
import com.pharmapartners2.api.repository.EpisodeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@RestController
public class EpisodeController {
    @Autowired
    private EpisodeRepository episodeRepository;

    @GetMapping("/episode")
    public @ResponseBody List<EpisodeModel> getAllEpisodes()
    {
        return episodeRepository.findAll();
    }
}