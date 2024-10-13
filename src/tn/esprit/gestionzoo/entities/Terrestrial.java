package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    public int nbrlegs;

    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrlegs) {
        super(family, name, age, isMammal);
        this.nbrlegs = nbrlegs;
    }
    public Terrestrial(){}

    @Override
    public String toString() {
        return super.toString()+"Terrestrial [nbrlegs=" + nbrlegs + "]";
    }
}
