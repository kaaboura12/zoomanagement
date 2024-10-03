 class Zoo {
     Animal[] animals;
     String name;
     String city;
     final int nbrCages=25;

    // Constructeur
     Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

     boolean addAnimal(Animal animal){
        if(this.searchAnimal(animal)==-1&&nbrCages<25) {
            for (int i = 0; i < nbrCages; i++) {
                if (animals[i]==null) {
                    animals[i]=animal;
                    return true;
                }
            }
        }
        return false;
     }

     void displayanimals(){
         for(Animal animal : animals){
             System.out.println(animal);
         }
     }

     int searchAnimal(Animal animal){
         for(int i=0; i<nbrCages; i++){
             if(animals[i].name.equals(animal.name)){
                 return i;
             }

         }
         return -1;
     }

     boolean removeAnimal(Animal animal){
         int index = searchAnimal(animal);
         if(index!=-1){
             animals[index] = null;
             return true;
         }
         return false;
     }

     boolean IsZooFull(){
         int nb=0;
         for (Animal animal : animals) {
             if (animal == null) {
                 nb=nb+1;
             }
         }
         if (nb==nbrCages) {return true;}
         else {return false;}

     }

     Zoo CompareZoo(Zoo z1, Zoo z2){
         int nbz1=0;
         int nbz2=0;
         for(int i=0; i<nbrCages; i++){
             if(z1.animals[i]!=null){
                 nbz1++;
             }
         }
         for(int i=0; i<nbrCages; i++){
             if(z2.animals[i]!=null){
                 nbz2++;
             }
         }
         if(nbz1<nbz2){
             return  z1;
         }
         else {return z2;}
     }

}