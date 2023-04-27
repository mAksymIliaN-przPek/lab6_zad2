import java.util.Scanner;
class SamochodOsobowy extends Samochod {
    double waga;
    double pojemnoscSilnika;
    int iloscOsob;

    SamochodOsobowy() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wagę (2-4.5t): ");
        this.waga = Math.min(Math.max(2, scanner.nextDouble()), 4.5);
        System.out.print("Podaj pojemność silnika (0.8-3.0): ");
        this.pojemnoscSilnika = Math.min(Math.max(0.8, scanner.nextDouble()), 3.0);
        System.out.print("Podaj ilość osób: ");
        this.iloscOsob = scanner.nextInt();
    }

    @Override
    void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Waga: " + waga + " t");
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " l");
        System.out.println("Ilość osób: " + iloscOsob);
    }
}