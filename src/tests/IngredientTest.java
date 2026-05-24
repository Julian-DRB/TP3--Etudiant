package tests;

import logique.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Julian Rodriguez
 * Ordre de conception : 3e
 */

class IngredientTest {

    @Test
    void constructeur_valeursValides_creeIngredient() {
        Ingredient ingredient = new Ingredient("Mandagore", 10);

        assertEquals("Mandagore", ingredient.getNom());
        assertEquals(10, ingredient.getPrix());
    }

    @Test
    void constructeur_nomNull_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ingredient(null, 10);
        });
    }

    @Test
    void constructeur_nomTropCourt_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ingredient("abc", 10);
        });
    }

    @Test
    void constructeur_prixZero_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ingredient("Mandagore", 0);
        });
    }

    @Test
    void constructeur_prixNegatif_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ingredient("Mandagore", -5);
        });
    }


}