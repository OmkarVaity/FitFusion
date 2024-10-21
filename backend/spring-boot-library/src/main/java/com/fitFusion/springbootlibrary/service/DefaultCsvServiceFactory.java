package com.fitFusion.springbootlibrary.service;


import com.fitFusion.springbootlibrary.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultCsvServiceFactory implements CsvServiceFactory {

    private final CustomerRepository customerRepository;

    @Autowired
    public DefaultCsvServiceFactory(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CsvService createCsvService() {
        return new CsvService(customerRepository);
    }
}