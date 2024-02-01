package org.example.inheritence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by Almaz on 01.02.2024
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal {
    String type;
}
