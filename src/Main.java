public class Main {
    public static void main(String[] args) {
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod("Lada", "Niva", "suv", "zielony", 2001, 45000);

        System.out.println("\nSamochód osobowy:");
        samochodOsobowy.wyswietlInformacje();
        System.out.println("\nSamochód 1:");
        samochod1.wyswietlInformacje();
        System.out.println("\nSamochód 2:");
        samochod2.wyswietlInformacje();
    }
}