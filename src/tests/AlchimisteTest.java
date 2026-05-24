package tests;

import logique.Alchimiste;
import logique.Ingredient;
import logique.Recette;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Julian Rodriguez
 * Ordre de conception : 3e
 */

class AlchimisteTest {

    @Test
    void constructeur_valeursValides_creeAlchimiste() {
        Alchimiste alchimiste = new Alchimiste("Julian");

        assertEquals("Julian", alchimiste.getNom());
        assertEquals(1, alchimiste.getNiveau());
        assertEquals(0, alchimiste.getExperience());
    }

    @Test
    void constructeur_nomNull_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Alchimiste(null);
        });
    }

    @Test
    void constructeur_nomTropCourt_lanceException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Alchimiste("abc");
        });
    }

    @Test
    void fairePotion_recetteNull_lanceException() {
        Alchimiste alchimiste = new Alchimiste("Julian");

        assertThrows(IllegalArgumentException.class, () -> {
            alchimiste.fairePotion(null);
        });
    }
}