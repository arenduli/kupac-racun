public class Kupac extends Osoba {

    private double saldoNaRacunu;

    public Kupac(String ime, String prezime, String OIB, double saldoNaRacunu) {
        super(ime, prezime, OIB);
        this.saldoNaRacunu = saldoNaRacunu;
    }

    // ispisuje podatke o kupcu
    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Saldo na računu: " + saldoNaRacunu);
    }
}
