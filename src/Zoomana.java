import java.util.Scanner;

public class Zoomana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donner le nom du zoo: ");
        String zooname = scanner.nextLine();
        while (zooname.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne peut pas être vide. Réessayez: ");
            zooname = scanner.nextLine();
        }

        System.out.print("Donner le nombre de cages: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un entier valide pour le nombre de cages: ");
            scanner.next();
        }
        int nbrcages = scanner.nextInt();

        System.out.println(zooname + " comporte " + nbrcages + " cages");

        Animal lion = new Animal("thadiyet", "Lion", 5, true);
        Animal tiger = new Animal("thadiyet", "tiger", 7, true);
        Animal tiger2 = new Animal("thadiyet", "tiger22", 15, true);

        Zoo myZoo = new Zoo("belvedere", "pasage");
        System.out.println(myZoo);
        System.out.println(lion);
        //lion.display_animal();
        System.out.println("Détails du zoo : " + myZoo.city+"/"+myZoo.name+"/"+myZoo.nbrCages);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(tiger2);

        myZoo.displayanimals();

        System.out.println(myZoo.searchAnimal(tiger2));

    }
}