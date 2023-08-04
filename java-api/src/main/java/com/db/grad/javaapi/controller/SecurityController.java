package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.model.Securities;
import com.db.grad.javaapi.service.BookService;
import com.db.grad.javaapi.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class SecurityController {
    private SecurityService securityService;

    @Autowired
    public SecurityController(SecurityService sv) {
        securityService = sv;
    }

//    @GetMapping("/securities/{date}")
//    public ResponseEntity<Securities> findRecentMature(@PathVariable(value = "date") String date)
//            throws ResourceNotFoundException {
//        Securities security = securityService.findRecentMature(date);
//        return ResponseEntity.ok().body(security);
//    }


    @GetMapping("/securities")
    public List <Securities> getAllSecurities() {
        return securityService.getAllSecurities();
    }


    //    @GetMapping("/securities/{secID}")
    @RequestMapping(value="/securities/{secID}", method=RequestMethod.GET)
    public ResponseEntity < Securities > getSecuritiesById(@PathVariable(value = "secID") int id)
            throws ResourceNotFoundException {
        Securities sec = securityService.getSecuritiesById(id);
        return ResponseEntity.ok().body(sec);
    }
}