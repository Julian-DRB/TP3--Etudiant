package logique;

import java.util.ArrayList;

/**
 * Author : Mathieu Bourgoin
 * Ordre de conception : 3e
 */
public class Recette
{
    private ArrayList<Ingredient> ingredients;
    private String nom;
    private int difficulte;
    private int pointExperience;

    public Recette(Ingredient ing1, Ingredient ing2, Ingredient ing3, String nom, int difficulte, int pointExperience)
    {
        this.ingredients = new ArrayList<Ingredient>();
        this.ingredients.add(ing1);
        this.ingredients.add(ing2);
        this.ingredients.add(ing3);

        this.setDifficulte(difficulte);
        this.setNom(nom);
        this.setPointExperience(pointExperience);

        if (ing1 == null || ing2 == null || ing3 == null) {
            throw new IllegalArgumentException("Les ingrédients ne peuvent pas être null.");
        }

        if (ing1.equals(ing2) || ing1.equals(ing3) || ing2.equals(ing3)) {
            throw new IllegalArgumentException("Une recette ne peut pas contenir deux fois le même ingrédient.");
        }

        if (ing1.getNom().equals(ing2.getNom()) ||
                ing1.getNom().equals(ing3.getNom()) ||
                ing2.getNom().equals(ing3.getNom())) {
            throw new IllegalArgumentException("Les ingrédients doivent être différents.");
        }



    }


    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;

        if (nom == null || nom.length() < 10) {throw new IllegalArgumentException("Le nom doit contenir au moins 6 caractères."); }
    }

    public int getDifficulte() {
        return difficulte;
    }

    private void setDifficulte(int difficulte) {
        this.difficulte = difficulte;

        if (difficulte < 1 || difficulte > 5) { throw new IllegalArgumentException("la difficulté doit être entre 1 et 5."); }
    }

    public int getPointExperience() {
        return pointExperience;
    }

    private void setPointExperience(int pointExperience) {
        this.pointExperience = pointExperience;

        if (pointExperience <= 0) { throw new IllegalArgumentException("Les points d'experience doit être supérieur a 0."); }
    }

    public int obtenirPrix()
    {
        int prixTotal = 0;

        for (Ingredient ing : this.ingredients)
            prixTotal += ing.getPrix();

        return prixTotal;
    }

    public boolean contientIngredient(String nom)
    {
        boolean estContenu = false;

        for (Ingredient ing : this.ingredients)
        {
            if (ing.getNom().equals(nom))
            {
                estContenu = true;
                break;
            }
        }

        if (nom == null) {
            throw new IllegalArgumentException("Le nom ne peut pas être null.");
        }

        return estContenu;
    }
    @Override
    public String toString()
    {
        return String.format("%s|%s|%s|%s|%s|%s", this.getNom(), this.ingredients.get(0).getNom(), this.ingredients.get(1).getNom(), this.ingredients.get(2).getNom(), this.getDifficulte(), this.getPointExperience());
    }


}
