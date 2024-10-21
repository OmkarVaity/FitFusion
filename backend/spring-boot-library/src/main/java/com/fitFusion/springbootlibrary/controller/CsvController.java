package com.fitFusion.springbootlibrary.controller;

import com.fitFusion.springbootlibrary.service.CsvService;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class CsvController {

    @Autowired
    private CsvService csvService;

    // This is the endpoint that will be called when the user uploads a CSV file it will accept the .csv files and decode it.
    @PostMapping("/api/upload-csv")
    public ResponseEntity<String> uploadCsvFile(@RequestBody MultipartFile file) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        try {
            csvService.readDataFromCsv(file);
            return new ResponseEntity<>("File uploaded and data saved successfully", headers, HttpStatus.OK);
        }catch (CsvException e) {
            System.out.println("CSV exception: "+e);
            return new ResponseEntity<>("Error in parsing CSV file "+e.getMessage(), headers, HttpStatus.BAD_REQUEST);
        }catch(IOException e){
            System.out.println("IOException: "+e);
            return new ResponseEntity<>("IOException: "+e.getMessage(), headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }catch(Exception e){
            System.out.println("exception: "+e.getMessage());
            return new ResponseEntity<>("Error in processing the file "+ e.getMessage(), headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}