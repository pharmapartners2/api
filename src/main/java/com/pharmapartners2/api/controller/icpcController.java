public class icpcController {
    
}
package com.pharmapartners2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pharmapartners2.api.dao.icpcCode;
import com.pharmapartners2.api.repository.icpcCodeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@RestController
public class icpcController {
    @Autowired
    private icpcCodeRepository icpcRepository;

    @GetMapping("/icpcCode")
    public @ResponseBody List<IcpcCode> getIcpcCode()
    {
        return icpcCodeRepository.findAll();
    }
}