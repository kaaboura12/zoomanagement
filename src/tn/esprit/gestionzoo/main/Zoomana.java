package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class Zoomana {

    public static void main(String[] args) throws ZooFullException, InvalidAgeException {
      /*  //creation de deux instances myzoo et lion et autre instance
        Zoo myzoo=new Zoo("bilvedere","tunis");
        Animal lion=new Animal("thediyet","lion",12,true);
        Animal tiger=new Animal("tiger","tiger",14,true);
        Animal dog=new Animal("dog","dog",-6,false);
        Animal cat=new Animal("cat","cat",16,false);
//affichage avec tostring
        System.out.println(myzoo);
        System.out.println(lion);

//ajout des animals dans le zoo

        myzoo.addAnimal(lion);
        myzoo.addAnimal(tiger);
        myzoo.addAnimal(dog);
        myzoo.addAnimal(cat);

//rechreche dun animal(test)

        System.out.println(myzoo.searchAnimal(dog));
        System.out.println(myzoo.searchAnimal(cat));
        System.out.println(myzoo.searchAnimal(tiger));

        Animal animal = new Animal();
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        System.out.println(animal);
        //System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        //aquatic.swim();
        //dolphin.swim();
        //penguin.swim();
       // myzoo.methodeswim();
        float maxDepth = myzoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale de nage des pingouins dans le zoo est : "+maxDepth );
        myzoo.displayNumberOfAquaticsByType();
        myzoo.addAnimal(lion);
        System.out.println("Nombre d'animaux après ajout du dauphin : " + myzoo.getCurrentAnimalCount());
        myzoo.addAnimal(tiger);
        System.out.println("Nombre d'animaux après ajout du dauphin : " + myzoo.getCurrentAnimalCount());
        myzoo.addAnimal(dog);
        System.out.println("Nombre d'animaux après ajout du dauphin : " + myzoo.getCurrentAnimalCount());
        myzoo.addAnimal(cat);
        System.out.println("Nombre d'animaux après ajout du dauphin : " + myzoo.getCurrentAnimalCount());

        myzoo.afficherAnimaux();*/
        Aquatic dolphin = new Aquatic("Dolphin family", "Flipper", 5, true, "Ocean");
        Penguin penguin = new Penguin("Penguin family", "Penny", 3, true, "Arctic", 200);
        Terrestrial bear = new Terrestrial("Bear family", "Grizzly", 6, true, 5);
        dolphin.eatMeat(Food.MEAT);
        dolphin.eatMeat(Food.PLANT);
        penguin.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.PLANT);
        penguin.eatMeat(Food.BOTH);
        bear.eatMeat(Food.MEAT);
        bear.eatPlant(Food.PLANT);
        bear.eatPlantAndMeat(Food.BOTH);
    }





    }
