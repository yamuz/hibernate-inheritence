package org.example.inheritence.service.impl;

import org.example.inheritence.exception.DogNotFoundException;
import org.example.inheritence.model.Dog;
import org.example.inheritence.repository.DogRepository;
import org.example.inheritence.service.DogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by Almaz on 01.02.2024
 */
@Service
public class DogServiceImpl implements DogService {
    final DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> getDogs() {
        return dogRepository.findAll();
    }

    @Override
    public Dog findById(Long id) {
        return dogRepository.findById(id).orElseThrow(
                ()-> new DogNotFoundException(id));
    }
}
