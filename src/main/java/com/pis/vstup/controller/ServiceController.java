package com.pis.vstup.controller;

import com.pis.vstup.persistance.entities.Marks;
import com.pis.vstup.persistance.entities.Users;
import com.pis.vstup.services.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ServiceController {

    private final ServiceImpl service;

    @GetMapping(value = "/rating")
    public ResponseEntity<?> getRating() {
        return ResponseEntity.ok(service.getRating());
    }

    @PostMapping(value = "/user")
    public ResponseEntity<Object> addUser(@RequestBody Users user){
        service.createUser(user);
        return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
    }

    @PostMapping(value = "/user/{id}/marks")
    public ResponseEntity<Object>
    addMarks(@PathVariable("id") Integer userID, @RequestBody Marks marks){
        service.addMarksAndRating(userID, marks);
        return new ResponseEntity<>("Marks added for user " + userID,HttpStatus.CREATED);
    }

}
