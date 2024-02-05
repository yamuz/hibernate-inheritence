package org.example.inheritence.controller;

import org.example.inheritence.dto.DogPage;
import org.example.inheritence.model.Dog;
import org.example.inheritence.service.DogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by Almaz on 01.02.2024
 */
@RestController
@RequestMapping("/dogs")
public class DogController {

    final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping
    public ResponseEntity<DogPage> getDogs(@RequestParam("pageNumber") Integer pageNumber){
        if (pageNumber == null)
            throw new IllegalArgumentException();

        List<Dog> dogs = dogService.getDogs();

        return ResponseEntity.ok(DogPage.builder().dogs(dogs).build());
    }

    @GetMapping("/{id}")
    public Dog getById(@PathVariable Long id){
        return dogService.findById(id);
    }

}
