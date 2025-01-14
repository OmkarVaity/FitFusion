package com.fitFusion.springbootlibrary.service;

import com.fitFusion.springbootlibrary.entity.Exercise;

import java.util.List;

public interface NameSortableExcerciseService extends ExerciseServiceInterface {

    List<Exercise> getSortedExercisesByName();
}
