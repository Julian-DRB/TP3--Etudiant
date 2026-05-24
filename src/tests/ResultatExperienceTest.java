package tests;

import logique.ResultatExperience;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Julian Rodriguez
 * Ordre de conception : 3e
 */

class ResultatExperienceTest {

    @Test
    void constructeur_valeursParDefaut_existeEtSuccessFalse() {
        ResultatExperience resultat = new ResultatExperience();

        assertFalse(resultat.getExiste());
        assertFalse(resultat.getSuccess());
    }

    @Test
    void setExiste_true_modifieExiste() {
        ResultatExperience resultat = new ResultatExperience();

        resultat.setExiste(true);

        assertTrue(resultat.getExiste());
    }

    @Test
    void setSuccess_true_modifieSuccess() {
        ResultatExperience resultat = new ResultatExperience();

        resultat.setSuccess(true);

        assertTrue(resultat.getSuccess());
    }
}