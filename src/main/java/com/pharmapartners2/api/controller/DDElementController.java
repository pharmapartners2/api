package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.DDElement;
import com.pharmapartners2.api.repository.DDElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DDElementController {
    @Autowired
    private DDElementRepository ddElementRepository;

    @GetMapping("/ddelement")
    public @ResponseBody Iterable<DDElement> getAllDDElements(){return ddElementRepository.findAll();}


    @GetMapping("/ddelement/{ddelementId}")
    public @ResponseBody Optional<DDElement> getDDElementById(@PathVariable int ddelementId){return ddElementRepository.findById(ddelementId);}


}
