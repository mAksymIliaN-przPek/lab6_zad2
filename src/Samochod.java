import java.util.Scanner;

class Samochod {
    String marka;
    String model;
    String nadwozie;
    String kolor;
    int rokProdukcji;
    int przebieg;

    Samochod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj markę: ");
        this.marka = scanner.nextLine();
        System.out.print("Podaj model: ");
        this.model = scanner.nextLine();
        System.out.print("Podaj nadwozie: ");
        this.nadwozie = scanner.nextLine();
        System.out.print("Podaj kolor: ");
        this.kolor = scanner.nextLine();
        System.out.print("Podaj rok produkcji: ");
        this.rokProdukcji = scanner.nextInt();
        System.out.print("Podaj przebieg: ");
        this.przebieg = Math.max(0, scanner.nextInt());
    }

    Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = Math.max(0, przebieg);
    }

    void wyswietlInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Nadwozie: " + nadwozie);
        System.out.println("Kolor: " + kolor);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}