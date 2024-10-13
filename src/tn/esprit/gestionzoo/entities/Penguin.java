package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    public float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public Penguin(){}
    @Override
    public String toString() {
        return super.toString()+"swimmingDepth="+swimmingDepth;
    }
}
