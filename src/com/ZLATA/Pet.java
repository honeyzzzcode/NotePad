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

        for (Species l : Species.values()) {
            System.out.println(l);
        }
       try {
           var specie = InputUtils.askString("Choose specie:");
           var type = Species.valueOf(specie);
           if (type != specie){
               System.err.println("DOG \n FISH \n CAT");
               continue;
           }
       }catch (
    InputMismatchException e) {
        String input = InputUtils.askString("");
        System.out.println(input + " is not specie");
        System.err.println("this is not one of species");
    }


    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s  name: %s  Specie: ", str, name , ?);

    }

}

