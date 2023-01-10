package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.AppointmentModel;
import com.pharmapartners2.api.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/appointment")
    public @ResponseBody List<AppointmentModel> getAllAppointments(){return appointmentRepository.findAll();}


    @GetMapping("/appointment/{appointmentId}")
    public @ResponseBody AppointmentModel getAppointmentById(@PathVariable int appointmentId){return appointmentRepository.findById(appointmentId);}

    @PostMapping("/appointment")
    public AppointmentModel setAppointment(@RequestBody AppointmentModel appointmentModel){
        return appointmentRepository.save(appointmentModel);
    };
}
