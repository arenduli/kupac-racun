public class Blagajnik extends Osoba {

    private String oznakaBlagajne;

    public Blagajnik(String ime, String prezime, String OIB, String oznakaBlagajne) {
        super(ime, prezime, OIB);
        this.oznakaBlagajne = oznakaBlagajne;
    }

    // ispisuje podatke o blagajniku
    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Oznaka blagajne: " + oznakaBlagajne);
    }
}
