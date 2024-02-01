package org.example.inheritence.service;

import org.example.inheritence.model.Dog;

import java.util.List;

/**
 * created by Almaz on 01.02.2024
 */
public interface DogService {
    List<Dog> getDogs();
    Dog findById(Long id);
}
