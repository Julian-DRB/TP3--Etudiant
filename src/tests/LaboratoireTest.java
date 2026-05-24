package tests;

import logique.Alchimiste;
import logique.Ingredient;
import logique.Laboratoire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Julian Rodriguez
 * Ordre de conception : 3e
 */

class LaboratoireTest {

    @Test
    void constructeur_valide_creeLaboratoire() {
        Alchimiste alchimiste = new Alchimiste("Julian");

        Laboratoire laboratoire = new Laboratoire(alchimiste);

        assertEquals(alchimiste, laboratoire.getProprietaire());
        assertNotNull(laboratoire.getIngredients());
        assertNotNull(laboratoire.getRecettes());
    }

    @Test
    void constructeur_alchimisteNull_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Laboratoire(null);
        });
    }

    @Test
    void trouverIngredient_ingredientExistant_retourneIngredient() {
        Alchimiste alchimiste = new Alchimiste("Julian");
        Laboratoire laboratoire = new Laboratoire(alchimiste);

        Ingredient ingredient =
                laboratoire.trouverIngredient("Mandagore");

        assertNotNull(ingredient);
    }

    @Test
    void trouverIngredient_ingredientInexistant_retourneNull() {
        Alchimiste alchimiste = new Alchimiste("Julian");
        Laboratoire laboratoire = new Laboratoire(alchimiste);

        Ingredient ingredient =
                laboratoire.trouverIngredient("ABCXYZ");

        assertNull(ingredient);
    }
}