package org.example.inheritence.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.inheritence.model.Dog;

import java.util.List;

/**
 * created by Almaz on 01.02.2024
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DogPage {
    List<Dog> dogs;
}
