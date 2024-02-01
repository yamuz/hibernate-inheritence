package org.example.inheritence.exception;

/**
 * created by Almaz on 01.02.2024
 */
public class DogNotFoundException extends RuntimeException{

    Long id;

    public DogNotFoundException(Long id) {
        this.id = id;
    }
}
