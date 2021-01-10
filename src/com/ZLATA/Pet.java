package com.ZLATA;

import java.util.InputMismatchException;

public class Pet extends Record {
    private String name;
    private Species species;

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void askData() {

        name = InputUtils.askString("Write name");
        while (true) {
            for (Species l : Species.values()) {
                System.out.println(l);
            }
            try {
                var strSpecies = InputUtils.askString("Choose specie:");
                species = Species.valueOf(strSpecies);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println("Mistake.Such specie doesnt exist ");
            }
        }
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s  name: %s  Specie: %s ", str, name, species);

    }

    @Override
    public boolean contains(String substr) {
        var strSpecies = String.valueOf(species);
        return super.contains(substr)
                || strSpecies.toLowerCase().contains(substr)
                || name.toLowerCase().contains(substr);
    }
}

