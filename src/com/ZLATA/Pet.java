package com.ZLATA;

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

        for (Species l : Species.values()) {
            System.out.println(l);
        }
        species = InputUtils.askString("Choose specie:");
        var type = Species.valueOf(species);

    }
    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s  name: %s ,specie:%s ", str, name, species );

    }
}

