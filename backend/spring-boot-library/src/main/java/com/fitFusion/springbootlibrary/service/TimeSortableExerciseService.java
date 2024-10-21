package com.fitFusion.springbootlibrary.service;

import com.fitFusion.springbootlibrary.dao.ExerciseRepository;
import com.fitFusion.springbootlibrary.entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TimeSortableExerciseService extends ExerciseService implements TimeSortableExerciseServiceInterface, NameSortableExcerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    // Inner class for sorting-related exceptions
    public class SortingExceptionHandler {
        public void handleSortingException(String message) {
            // Add logic for handling sorting-related exceptions, e.g., logging or notifying
            System.err.println("Sorting Exception occurred: " + message);
        }
    }

    @Override
    public List<Exercise> getSortedExercisesByDuration() {
        try {
            return exerciseRepository.findAll()
                    .stream().sorted(Comparator.comparing(Exercise::getDuration))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            // Using the inner class for handling sorting-related exceptions
            SortingExceptionHandler sortingExceptionHandler = new SortingExceptionHandler();
            sortingExceptionHandler.handleSortingException("Error while sorting exercises by duration: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Exercise> getSortedExercisesByName() {
        try {
            return exerciseRepository.findAll().stream().
                    sorted(Comparator.comparing(Exercise::getName)).collect(Collectors.toList());
        } catch (Exception e) {
            // Using the inner class for handling sorting-related exceptions
            SortingExceptionHandler sortingExceptionHandler = new SortingExceptionHandler();
            sortingExceptionHandler.handleSortingException("Error while sorting exercises by name: " + e.getMessage());
            return null;
        }
    }
}