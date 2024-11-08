package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic() {}

    @Override
    public String toString() {
        return super.toString() + " habitat=" + habitat;
    }

    // Déclare la méthode swim() comme abstraite pour qu'elle soit obligatoirement redéfinie
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return Objects.equals(this.getName(), other.getName()) &&
                this.getAge() == other.getAge() &&
                Objects.equals(this.habitat, other.habitat);
    }

}
