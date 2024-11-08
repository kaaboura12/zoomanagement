package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    public float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(){}
    @Override
    public String toString() {
        return super.toString()+"swimmingDepth="+swimmingDepth;
    }
    public void swim()
    {
        System.out.println("penguin  is wimming");
    }


}
