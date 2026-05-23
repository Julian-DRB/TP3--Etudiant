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
        Ingredient ingredient = new Ingredient("Mandragore", 10);

        assertEquals("Mandragore", ingredient.getNom());
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
            new Ingredient("Mandragore", 0);
        });
    }

    @Test
    void constructeur_prixNegatif_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ingredient("Mandragore", -5);
        });
    }


}