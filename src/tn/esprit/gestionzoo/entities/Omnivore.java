package tn.esprit.gestionzoo.entities;

public interface Omnivore extends Carnivore, Herbivore{
    void eatPlantAndMeat(Food food);
}
