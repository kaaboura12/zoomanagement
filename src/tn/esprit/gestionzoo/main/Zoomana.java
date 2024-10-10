package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;

import java.util.Scanner;

public class Zoomana {

    public static void main(String[] args) {
        //creation de deux instances myzoo et lion et autre instance
        Zoo myzoo=new Zoo("bilvedere","tunis");
        Animal lion=new Animal("thediyet","lion",12,true);
        Animal tiger=new Animal("tiger","tiger",14,true);
        Animal dog=new Animal("dog","dog",15,false);
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



    }
}