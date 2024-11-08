package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore{
    public int nbrlegs;

    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrlegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrlegs = nbrlegs;
    }
    public Terrestrial(){}

    @Override
    public String toString() {
        return super.toString()+"Terrestrial [nbrlegs=" + nbrlegs + "]";
    }
    @Override
    public void eatMeat(Food food) {

    }

    @Override
    public void eatPlant(Food food) {

    }
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        }
    }

}
