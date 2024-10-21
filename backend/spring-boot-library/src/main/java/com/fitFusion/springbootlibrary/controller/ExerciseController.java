package com.fitFusion.springbootlibrary.controller;

import com.fitFusion.springbootlibrary.entity.Exercise;
import com.fitFusion.springbootlibrary.service.NameSortableExcerciseService;
import com.fitFusion.springbootlibrary.service.TimeSortableExerciseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin( origins = "http://localhost:5173")
@RestController
public class ExerciseController {

    @Autowired
    private TimeSortableExerciseServiceInterface timeSortableExerciseServiceInterface;

    @Autowired
    private NameSortableExcerciseService nameSortableExerciseServiceInterface;

    @GetMapping("/api/exercises")
    public ResponseEntity<List<Exercise>> getExercises() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(timeSortableExerciseServiceInterface.getExercises(), headers, HttpStatus.OK);
    }

    @GetMapping("/api/exercises/sortByDuration")
    public ResponseEntity<List<Exercise>> getSortedFitnessClasses() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(timeSortableExerciseServiceInterface.getSortedExercisesByDuration(), headers, HttpStatus.OK);
    }

    @GetMapping("/api/exercises/sortByName")
    public ResponseEntity<List<Exercise>> getSortedExercisesByName() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);


        return new ResponseEntity<>(nameSortableExerciseServiceInterface.getSortedExercisesByName(), headers, HttpStatus.OK);
    }

}
