package com.fitFusion.springbootlibrary.service;

import com.fitFusion.springbootlibrary.dao.CustomerRepository;
import com.fitFusion.springbootlibrary.entity.Customer;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CsvService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public void readDataFromCsv(MultipartFile csvFile) throws IOException, CsvException, Exception {
        // Read data from CSV file
        try (CSVReader reader = new CSVReader(new InputStreamReader(csvFile.getInputStream()))) {
            List<String[]> allRows = reader.readAll();

            // Process each row and save to database
            for (String[] row : allRows) {
                // Assuming each row has two columns - for example, name and email
                String userId = row[0];
                String fitnessPlanId = row[1];
                // Create a new Customer object
                Customer customer = new Customer(userId, fitnessPlanId);

                // Save the customer to the database
                customerRepository.save(customer);
            }
        }
        catch (CsvException e){
            throw new CsvException();
        }
        catch (IOException e){
            throw new IOException();
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Autowired
    public CsvService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
