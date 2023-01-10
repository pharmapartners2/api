package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.AppointmentModel;
import com.pharmapartners2.api.dao.PatientModel;
import com.pharmapartners2.api.model.AppointmentByDatum;
import com.pharmapartners2.api.model.AppointmentRequest;
import com.pharmapartners2.api.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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

    @GetMapping("/appointment/day")
    public @ResponseBody List<AppointmentModel> getAppointmentByDate(@RequestBody AppointmentByDatum appointmentByDatum){
        try {
            //Date parsedDatum = DateFormat.getDateInstance().parse(appointmentByDatum.datum());
            Date parsedDate = new SimpleDateFormat("yyyy/MM/dd").parse(appointmentByDatum.datum());
            return appointmentRepository.findByDatum(parsedDate);
        } catch (ParseException e) {
            return null;
        }

    }
}
