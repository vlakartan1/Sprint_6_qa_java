package com.example;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalTestParameterized {
    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalTestParameterized(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return List.of(
                new Object[] {"Травоядное", List.of("Трава", "Различные растения")},
                new Object[] {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        );
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        List<String> actualFood = animal.getFood(animalKind);
        assertEquals(new HashSet<>(expectedFood), new HashSet<>(actualFood));
    }
}