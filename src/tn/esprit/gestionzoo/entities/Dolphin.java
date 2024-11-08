package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    public float swimming_speed;

    public Dolphin(String family, String name, int age, boolean isMammal,float swimming_speed,String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal,habitat);
        this.swimming_speed=swimming_speed;
    }
    public Dolphin(){}

    @Override
    public String toString() {
        return super.toString()+"swimming_speed="+swimming_speed;
    }

    public void swim(){
        System.out.println("thisdolphin  is wimming");
    }
}
