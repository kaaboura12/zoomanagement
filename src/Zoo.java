 class Zoo {
     Animal[] animals;
     String name;
     String city;
     int nbrCages;

    // Constructeur
     Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }
}