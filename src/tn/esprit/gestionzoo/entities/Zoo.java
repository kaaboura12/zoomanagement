package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private Animal [] animals;
    private String name;
    private String city;
    public final int nbrCages=3;
    private Aquatic [] aquaticanimals=new Aquatic[10];
    private int nbrAqua;
    private int currentAnimalCount = 0;


//constructeur pour Zoo

    public Zoo(String name, String city) {
        animals = new Animal[this.nbrCages];
        this.name = name;
        this.city = city;
    }

//geters and setters

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Name is empty");
        }
        else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getCurrentAnimalCount() {
        return currentAnimalCount;
    }

    public void setCurrentAnimalCount(int currentAnimalCount) {
        this.currentAnimalCount = currentAnimalCount;
    }

//affichage to string!!!

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

//methode ajout animal

    public void addAnimal(Animal animal) throws ZooFullException {
        if (currentAnimalCount >= nbrCages) {
            throw new ZooFullException("Le zoo est plein. Impossible d'ajouter un autre animal.");
        }
        animals[currentAnimalCount] = animal;
        currentAnimalCount++;
    }

//methode affichage des animaux dans le zoo

    public void afficherAnimaux(){
        for(int i = 0; i < animals.length; i++){
            if(animals[i] != null){
                System.out.println(animals[i].toString());
            }
        }
    }

    //methode de recherche dun animal

    public int searchAnimal(Animal animal){
        for(int i = 0; i < animals.length; i++){
            if(animals[i] != null && animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }

    //methode pour supprision dun animal

    public boolean removeAnimal(Animal animal){
        for(int i = 0; i < animals.length; i++){
            if(animals[i]==animal){
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    //methode pour teste si le zoo est full

    public boolean isZoofull(){
        int nb=0;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                nb++;
            }
        }
        if (nb == nbrCages) {
            return true;
        }else
            return false;
    }

    //methode de comparison entre les zoo
    public Zoo comparerZoo(Zoo z1,Zoo z2){
        int nbz1=0;
        int nbz2=0;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                nbz1++;
            }
        }
        for (int j = 0; j < nbrCages; j++) {
            if (animals[j] != null) {
                nbz2++;
            }
        }
        if (nbz1<nbz2) {
            return z1;
        }
        else
            return z2;
    }

    //public void addAquaticAnimal(Aquatic aquatic){
      //  for(int i = 0; i < aquaticanimals.length; i++){
        //    if(aquaticanimals[i]==null){
            //    aquaticanimals[i] = aquatic;
          //      return;
            //}
        //}
    //}
    public void addAquaticAnimall(Aquatic aquatic){
       aquaticanimals[nbrAqua]=aquatic;
       nbrAqua++;
    }

    /*public void methodeswim(){
        for(Aquatic aquatic : aquaticanimals){
            aquatic.swim();
        }
    }*/

    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1; // Valeur par défaut si aucun pingouin n'est trouvé

        for (Aquatic aquatic : aquaticanimals) {
            if (aquatic != null && aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticanimals) {
            if (aquatic != null) {
                if (aquatic instanceof Dolphin) {
                    dolphinCount++;
                } else if (aquatic instanceof Penguin) {
                    penguinCount++;
                }
            }
        }
        System.out.println("Number of Dolphins in the zoo: " + dolphinCount);
        System.out.println("Number of Penguins in the zoo: " + penguinCount);
    }
}
