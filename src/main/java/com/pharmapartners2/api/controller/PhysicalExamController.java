package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.PhysicalExamModel;
import com.pharmapartners2.api.repository.PhysicalExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhysicalExamController {
    @Autowired
    private PhysicalExamRepository physicalExamRepository;

    @GetMapping("/physicalexam/{patientId}")
    public @ResponseBody List<PhysicalExamModel> getPhysicalExamByPatientId(@PathVariable int patientId){return physicalExamRepository.findByPatientId(patientId);}
}
