package com.fitFusion.springbootlibrary.service;

import com.fitFusion.springbootlibrary.entity.Exercise;

import java.util.List;

public interface TimeSortableExerciseServiceInterface extends ExerciseServiceInterface {
    List<Exercise> getSortedExercisesByDuration();
}
