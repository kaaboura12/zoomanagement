 class Animal {
     String family;
     String name;
     int age;
     boolean isMammal;


     Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void display_animal(){
        System.out.println("Détails de l'animal : " + this.family+"/"+this.isMammal+"/"+this.name+"/"+this.age);
    }

     @Override
     public String toString() {
         return "Détails de l'animal : " + this.family+"/"+this.isMammal+"/"+this.name+"/"+this.age;
     }
 }
