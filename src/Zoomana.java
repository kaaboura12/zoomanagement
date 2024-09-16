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
    }
}