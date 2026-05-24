package tests;

import logique.Ingredient;
import logique.Recette;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Julian Rodriguez
 * Ordre de conception : 3e
 */

class RecetteTest {

    @Test
    void constructeur_valeursValides_creeRecette() {
        Ingredient ing1 = new Ingredient("Mandragore",10);
        Ingredient ing2 = new Ingredient("Licorne",20);
        Ingredient ing3 = new Ingredient("Dragonne",30);

        Recette recette = new Recette(ing1, ing2, ing3, "PotionMagique", 3, 100);

        assertEquals("PotionMagique", recette.getNom());
        assertEquals(3, recette.getDifficulte());
        assertEquals(100, recette.getPointExperience());
    }

    @Test
    void constructeur_ingredientNull_lanceException() {
        Ingredient ing2 = new Ingredient("Licorne",20);
        Ingredient ing3 = new Ingredient("Dragonne",30);

        assertThrows(IllegalArgumentException.class, () -> {
            new Recette(null, ing2, ing3, "PotionMagique", 3, 100);
        });
    }

    @Test
    void constructeur_ingredientsDupliques_lanceException() {
        Ingredient ing1 = new Ingredient("Mandragore",10);
        Ingredient ing2 = new Ingredient("Mandragore",20);
        Ingredient ing3 = new Ingredient("Dragonne",30);

        assertThrows(IllegalArgumentException.class, () -> {
            new Recette(ing1, ing2, ing3, "PotionMagique", 3, 100);
        });
    }

    @Test
    void constructeur_nomTropCourt_lanceException() {
        Ingredient ing1 = new Ingredient("Mandragore",10);
        Ingredient ing2 = new Ingredient("Licorne",20);
        Ingredient ing3 = new Ingredient("Dragonne",30);

        assertThrows(IllegalArgumentException.class, () -> {
            new Recette(ing1, ing2, ing3, "abc", 3, 100);
        });
    }

    @Test
    void constructeur_difficulteInvalide_lanceException() {
        Ingredient ing1 = new Ingredient("Mandragore",10);
        Ingredient ing2 = new Ingredient("Licorne",20);
        Ingredient ing3 = new Ingredient("Dragonne",30);

        assertThrows(IllegalArgumentException.class, () -> {
            new Recette(ing1, ing2, ing3, "PotionMagique", 7, 100);
        });
    }
}