package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.DDElement;
import com.pharmapartners2.api.dao.PhysicalExamModel;
import com.pharmapartners2.api.model.PhysicalExamRequest;
import com.pharmapartners2.api.repository.DDElementRepository;
import com.pharmapartners2.api.repository.PhysicalExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class PhysicalExamController {
    @Autowired
    private PhysicalExamRepository physicalExamRepository;
    @Autowired
    private DDElementRepository ddElementRepository;

    @GetMapping("/physicalexam/{patientId}")
    public @ResponseBody List<PhysicalExamModel> getPhysicalExamByPatientId(@PathVariable int patientId){return physicalExamRepository.findByPatientId(patientId);}

    @PostMapping("/physicalexam")
    public PhysicalExamModel createPhysicalExam(@RequestBody PhysicalExamRequest physicalExamRequest){
        DDElement ddElement = ddElementRepository.findDDElementById(physicalExamRequest.ddElementId());
        PhysicalExamModel physicalExam= new PhysicalExamModel();
        physicalExam.setWaarde(physicalExamRequest.waarde());
        physicalExam.setPatientId(physicalExamRequest.patientId());
        physicalExam.setDatum(Date.valueOf(physicalExamRequest.datum()));
        physicalExam.setDdElement(ddElement);
        return physicalExamRepository.save(physicalExam);
    }
}
