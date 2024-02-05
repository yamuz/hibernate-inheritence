package org.example.inheritence.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.example.inheritence.model.Animal;
import org.example.inheritence.repository.AnimalRepository;
import org.example.inheritence.service.AnimalService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * created by Almaz on 01.02.2024
 */
@Service
public class AnimalServiceImpl implements AnimalService {

    final AnimalRepository animalrepository;

    public AnimalServiceImpl(AnimalRepository animalrepository) {
        this.animalrepository = animalrepository;
    }

    @Override
    public void save(Animal animal) {

        animalrepository.save(animal);
    }

    @Override
    public Optional<Animal> getById(Long id) {
        if (id == null){
            throw new EntityNotFoundException("Animal not found by id " + id);
        }
        return Optional.of(animalrepository.getById(id));
    }
}
