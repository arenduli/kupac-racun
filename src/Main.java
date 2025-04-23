public class Main {

    public static void main(String[] args) {
        Kupac kupac1 = new Kupac("Pero", "Perić", "12547896547", 500.0);
        Kupac kupac2 = new Kupac("Ana", "Anić", "98547896547", 300.0);
        Kupac kupac3 = new Kupac("Eva", "Ević", "98598546547", 400.0);

        Blagajnik blagajnik1 = new Blagajnik("Marko", "Marić", "36587458745", "ECR 1");
        Blagajnik blagajnik2 = new Blagajnik("Ivan", "Ivić", "12025478965", "ECR 2");
        Blagajnik blagajnik3 = new Blagajnik("Sven", "Svenić", "12025478965", "ECR 3");

        Racun racun1 = new Racun(kupac1, blagajnik1, 150.0);
        Racun racun2 = new Racun(kupac2, blagajnik2, 200.0);
        Racun racun3 = new Racun(kupac3, blagajnik3, 350.0);

        PopisRacuna popisRacuna = new PopisRacuna();
        popisRacuna.dodajRacun(racun1);
        popisRacuna.dodajRacun(racun2);
        popisRacuna.dodajRacun(racun3);

        popisRacuna.spremi("src/racuni.txt");

        System.out.println("Računi su upisani u datoteku.");
    }
}
